package Bai_tap;

import java.util.Scanner;

public class Bai06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, fibonacci = 1, temp1 = 0, temp2 = 1;
        do {
            System.out.print("Vui Long nhap vao so duong : ");
            n = sc.nextInt();
            if (n <= 0) {
                System.out.println("So ban da nhap la so am, vui long nhap so duong");
            }
        } while (n <= 0);

        while (fibonacci <= n) {
            System.out.print(fibonacci + " ");
            temp1 = temp2;
            temp2 = fibonacci;
            fibonacci = temp1 + temp2;
        }
    }
}
