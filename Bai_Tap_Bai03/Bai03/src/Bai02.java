import java.util.Scanner;

/*Bài tập 2: Kiểm tra và tìm ngày kế tiếp, ngày trước đó

## Đề bài:
        > * Nhập vào thông tin 1 ngày (ngày – tháng – năm).
        > * Kiểm tra ngày có hợp lệ hay không?
        > * Nếu hợp lệ hãy tìm ra ngày kế tiếp (ngày – tháng – năm) & ngày trước đó (ngày – tháng – năm)*/
public class Bai02 {

    public static boolean kiemTraThoiGian(int d, int m, int y) {
        if (d <= 0 || d > 31) {
            return false;
        } else if (m <= 0 || m > 12) {
            return false;
        } else if (y <= 0) {
            return false;
        }
        return true;
    }

    public static boolean kiemTraNamNhuan(int y) {
        return y % 4 == 0 && y % 100 != 0 || y % 400 == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day, month, year;
        System.out.println("Vui lòng nhập lần lượt vào dưới đây ngày tháng năm: ");
        System.out.print("Ngày: ");
        day = sc.nextInt();
        System.out.print("Tháng: ");
        month = sc.nextInt();
        System.out.print("Năm: ");
        year = sc.nextInt();

        int nextDay = day + 1;
        int nextMonth = month;
        int nextYear = year;
        int yesterday = day - 1;
        int lastMonth = month;
        int lasryear = year;

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                if (nextDay > 31) {
                    nextDay = 1;
                    nextMonth++;
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                if (nextDay > 30) {
                    nextDay = 1;
                    nextMonth++;
                }
                break;
            case 2:
                if (kiemTraNamNhuan(year)) {
                    if (nextDay > 29) {
                        nextDay = 1;
                        nextMonth++;
                    }
                } else {
                    if (nextDay > 28) {
                        nextDay = 1;
                        nextMonth++;
                    }
                }
                break;
        }
        if (nextMonth > 12) {
            nextMonth = 1;
            nextYear++;
        }

        if (yesterday <= 0) {
            lastMonth--;
            if (lastMonth <= 0) {
                lastMonth = 12;
                lasryear--;
            }
            switch (lastMonth) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    yesterday = 31;
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    yesterday = 30;
                    break;
                case 2:
                    yesterday = kiemTraNamNhuan(lasryear) ? 29 : 28;
                    break;
            }
        }
        System.out.printf("Ngày kế tiếp: %d/%d/%d\n", nextDay, nextMonth, nextYear);
        System.out.printf("Ngày hôm trước: %d/%d/%d\n", yesterday, lastMonth, lasryear);
    }
}

