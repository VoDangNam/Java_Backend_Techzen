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
        int fibonaci = 1, temp1 = 0, temp2 = 1;
        while (fibonaci <= n) {
            System.out.print(fibonaci + " ");
            temp1=temp2;
            temp2=fibonaci;
            fibonaci=temp1+temp2;
        }
    }
}
