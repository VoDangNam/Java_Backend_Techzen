package Bai05.bai_tap;

import java.util.Scanner;

public class Bai05 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n;
        System.out.print("Nhap vao so duong: ");
        n=sc.nextInt();
        dayFibonaci(n);
    }

    public static void dayFibonaci(int n) {
        int a = 0, b = 1;
        for (int i = 1; i <= n; i++) {
            System.out.print(b + " ");
            int temp = a + b;
            a = b;
            b = temp;
        }
    }
}
