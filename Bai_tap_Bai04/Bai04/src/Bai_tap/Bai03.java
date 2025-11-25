package Bai_tap;

import java.util.Scanner;

public class Bai03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("Vui Long nhap vao so duong : ");
            n = sc.nextInt();
            if (n <= 0) {
                System.out.println("So ban da nhap la so am, vui long nhap so duong");
            }
        } while (n <= 0);

        for (int i = 2; i < n; i += 2) {
            if (i % 6 == 0) {
                System.out.print(-i);
            } else {
                System.out.print(i);
            }
            System.out.print(" ");
        }
    }
}
