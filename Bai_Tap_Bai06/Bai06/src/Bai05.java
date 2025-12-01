
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Bai05 {
    public static void main(String[] args) {
        String dayTime = "02/28/2025";
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate localDate1 = LocalDate.parse(dayTime, dateTimeFormatter);
        System.out.println(localDate1);

        //b
        LocalDateTime localDate2 = LocalDateTime.now();

        String dayNow = localDate2.getDayOfWeek().toString();
        System.out.println(dayNow);

        //c
        System.out.println("day: " + localDate2.getDayOfMonth());
        System.out.println("month: " + localDate2.getMonth());
        System.out.println("year: " + localDate2.getYear());
        System.out.println("hour: " + localDate2.getHour());
        System.out.println("minute: " + localDate2.getMinute());
        System.out.println("second: " + localDate2.getSecond());

        //d
        DateTimeFormatter dateTimeFormatter2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate localDate4 = LocalDate.now();
        LocalDate rS = localDate4.minus(1000, ChronoUnit.DAYS);
        String dateKQ = rS.format(dateTimeFormatter2);
        System.out.println("Now: " + localDate4);
        System.out.println("Past: " + dateKQ);

        //e
        addDay();


    }

    public static void addDay() {
        Scanner sc = new Scanner(System.in);
        String date;
        int n;
        System.out.println("Nhap vao ngay thang nam (dd/MM/yyyy) cach nhau boi dau /: ");
        date = sc.nextLine();
        DateTimeFormatter dateTimeFormatter3 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate localDate = LocalDate.parse(date, dateTimeFormatter3);
        System.out.println("Nhap vao so n: ");
        n = sc.nextInt();
        LocalDate kq = localDate.plusDays(n);
        String rS2 = kq.format(dateTimeFormatter3);
        System.out.println("e) " + rS2);
    }
}
