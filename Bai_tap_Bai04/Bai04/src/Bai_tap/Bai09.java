package Bai_tap;

import java.util.Scanner;

public class Bai09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        double total = 0;
        do {
            System.out.print("Vui Long nhap vao so duong : ");
            n = sc.nextInt();
            if (n <= 0) {
                System.out.println("So ban da nhap la so am, vui long nhap so duong");
            }
        } while (n <= 0);
        for (int i = 1; i <= n; i++) {
            total += (double) 1 / i;
            if (i < n) {
                System.out.printf("1/%d + ", i);
            } else {
                System.out.printf("1/%d", i);
            }
        }
        System.out.printf(" = %.2f%n", total);
    }
}
