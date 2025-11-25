package Bai_tap;

import java.util.Scanner;

public class Bai08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, a = 1;
        do {
            System.out.print("Vui Long nhap vao so duong : ");
            n = sc.nextInt();
            if (n <= 0) {
                System.out.println("So ban da nhap la so am, vui long nhap so duong");
            }
        } while (n <= 0);
        while (a <= n) {
            if (a % 3 == 0) {
                System.out.print(-a);
            } else {
                System.out.print(a);
            }
            System.out.print(" ");
            a = a * 2 + 1;

        }
    }
}
