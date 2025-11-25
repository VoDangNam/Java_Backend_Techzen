package Bai_tap;

import java.util.Scanner;

public class Bai10 {
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
            double fact = 1;
            for (int j = 1; j <= (2 * i - 1); j++) {
                fact = fact * j;
            }
            total = total + 1.0 / fact;
        }
        System.out.printf("Total= %.6f", total);

      /*  for (int i = 1; i <= n; i++) {
//            fact *= (2 * i) * (2 * i + 1);
            fact *= (2*i - 2)*(2*i - 1);
            total += 1.0 / fact;
        }
        System.out.printf("Total= %.5f", total);*/
    }
}
