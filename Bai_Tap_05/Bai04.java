package Bai05.bai_tap;

import java.util.Scanner;

public class Bai04 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int a, b;
        System.out.print("Nhap vao so a: ");
        a = sc.nextInt();
        System.out.print("Nhap vao so b: ");
        b = sc.nextInt();
        System.out.println(uocChungLonNhat(a,b));

    }

    public static int uocChungLonNhat(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
