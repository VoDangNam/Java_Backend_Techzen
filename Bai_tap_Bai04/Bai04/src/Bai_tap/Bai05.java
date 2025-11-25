package Bai_tap;

import java.util.Scanner;

public class Bai05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, dem = 0, khoanCach = 1;
        do {
            System.out.print("Vui Long nhap vao so duong : ");
            n = sc.nextInt();
            if (n <= 0) {
                System.out.println("So ban da nhap la so am, vui long nhap so duong");
            }
        } while (n <= 0);
        for (int i = 2; i < n; i += 2) {
            if (dem == khoanCach) {
                System.out.print(-i + " ");
                dem = 0;
                khoanCach++;
            } else {
                System.out.print(i + " ");
                dem++;
            }
        }
    }
}
