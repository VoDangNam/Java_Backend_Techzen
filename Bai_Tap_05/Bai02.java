package Bai05.bai_tap;

import java.util.Scanner;

public class Bai02 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int number;
        System.out.print("Nhap vao so : ");
        number = sc.nextInt();
        //A
        System.out.println(traVeSoDao(number));

        //B
        if (soDoiXung(number)) {
            System.out.println("So ban nhap la so doi xung");
        } else {
            System.out.println("So ban nhap khong phai la so doi xung");
        }

        // C
        if (isSquareNumber(number)) {
            System.out.printf("So %d ban nhap la so chinh phuong", number);
        } else {
            System.out.printf("So %d ban nhap khong la so chinh phuong", number);
        }


        //D
        if (soNguyenTo(number)) {
            System.out.printf("So %d la so nguyen to", number);
        } else {
            System.out.printf("So %d khong la so nguyen to", number);
        }

        //E
        System.out.println("Tong cac so le: " + tongCacChuSoLe(number));

        //F
        System.out.println("Tong cac chu so nguyen to: " + tongCacChuSoNT(number));


        //G
        System.out.println("Tong So Chinh Phuong: " + tongCacSoChinhPhuong(number));

    }

    public static int traVeSoDao(int n) {
        int kq = 0;
        int m = 0;
        while (n != 0) {
            m = n % 10; //3 2 1
            kq = kq * 10 + m; //3 32 321
            n /= 10; //12 1 0
        }
        return kq;
    }

    public static boolean soDoiXung(int n) {
        int kq = traVeSoDao(n);
        return n == kq;
    }

    public static boolean isSquareNumber(int n) {
        if (Math.sqrt(n) % 1 == 0) {
            return true;
        }
        return false;
    }

    public static boolean soNguyenTo(int n) {
        if (n <= 1) {
            return false;
        }
        if (n == 2) {
            return true;
        }
        if (n % 2 == 0) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int tongCacChuSoLe(int n) {
        int tong = 0;
        int m;
        while (n != 0) {
            m = n % 10;
            if (m % 2 != 0) {
                tong += m;
            }
            n /= 10;
        }
        return tong;
    }


    public static int tongCacChuSoNT(int n) {
        int total = 0;
        int m;
        while (n != 0) {
            m = n % 10;
            if (soNguyenTo(m)) {
                total += m;
            }
            n /= 10;
        }
        return total;
    }

    public static int tongCacSoChinhPhuong(int n) {
        int total = 0;
        int m;
        while (n != 0) {
            m = n % 10;
            if (isSquareNumber(m)) {
                total += m;
            }
            n /= 10;
        }
        return total;
    }

}
