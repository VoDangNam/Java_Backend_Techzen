package Bai05.bai_tap;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Bai01 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        char kiTu;
        System.out.print("Nhap vao ki tu: ");
        kiTu = sc.next().charAt(0);

        System.out.println("a. Kí tự của bạn sau khi chuyển đổi: " + changeCharUpOrDown(kiTu));
        double a, b;
        System.out.println("Ban nhap lan luot vao a va b: ");
        a = sc.nextDouble();
        b = sc.nextDouble();
        System.out.println("b. Kết quả của PT là: " + giaiPhuongTrinhBatNhat(a, b));

        double x, y, z;
        System.out.println("Nhap lan luot vao x y z de tinh pt bat hai: ");
        x = sc.nextDouble();
        y = sc.nextDouble();
        z = sc.nextDouble();
        giaiPhuongTrinhBacHai(x, y, z);
        int n1, n2, n3, n4;
        System.out.println("Nhap lan luot vao 4 so de tim min: ");
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        n3 = sc.nextInt();
        n4 = sc.nextInt();
        int fMin = findMin(n1, n2);
        int fMin2 = findMin(fMin, n3);
        System.out.println("So nho nhat cua ban la: " + findMin(fMin2, n4));


    }

    public static char changeCharUpOrDown(char kt) {

        if (kt >= 'A' && kt <= 'Z') {
            return kt += 32;
        } else {
            return kt -= 32;
        }

    }

    public static double giaiPhuongTrinhBatNhat(double a, double b) {
        double x = 0;
        if (a == 0) {
            if (b == 0) {
                System.out.println("b. PT có vô số nghiệm");
            } else {
                System.out.println("b. PT vô nghiệm");
            }
        } else {
            x = -b / a;
        }

        return x;
    }

    public static void giaiPhuongTrinhBacHai(double a, double b, double c) {
        double x;
        double dellta = b * b - 4 * a * c;
        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("PT co vo so nghiem");
                } else {
                    System.out.println("PT vo nghiem");
                }
            } else {
                x = -c / b;
                System.out.println("Nghiem cua phuong trinh cua ban la: " + x);
            }
        } else {


            if (dellta < 0) {
                System.out.println("PT vo nghiem");
            } else if (dellta == 0) {
                System.out.println("PT co 1 nghiem kep: " + (-b / 2 * a));
            } else {
                System.out.println("Phuong trinh co hai nghiem phan biet X1: " + (((-b + sqrt(dellta)) / (2 * a))));
                System.out.println("Phuong trinh co hai nghiem phan biet X2: " + (((-b) + sqrt(dellta)) / 2 * a));
            }
        }
    }

    public static int findMin(int a, int b) {
        if (a > b) {
            return b;
        }
        return a;
    }


}
