package Bai05.bai_tap;

import java.util.Scanner;

public class Bai03 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int number;
        System.out.print("Nhap vao so : ");
        number = sc.nextInt();

        System.out.printf("a) Tong tu 1 den %d= %d\n", number, cauA(number));
        System.out.println("b) "+cauB(number));
        System.out.println("c) "+cauC(number));
        System.out.println("d) "+cauD(number));
        System.out.println("e) "+cauE(number));
    }


    public static int cauA(int n) {
        int total = 0;
        for (int i = 1; i <= n; i++) {
            total += i;
        }
        return total;
    }

    public static int cauB(int n) {
        int total = 0;
        for (int i = 1; i <= n; i++) {
            total += (int) Math.pow(i, 2);
        }
        return total;
    }

    public static double cauC(int n) {
        double total = 1;
        for (int i = 2; i <= n; i++) {
            total += (double) 1 / i;
        }
        return total;
    }

    public static int cauD(int n){
        int total = 1;
        for (int i=1;i<=n;i++){
            total*=i;
        }
        return total;
    }

    public static long giaiThua(int num) {
        long result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        return result;
    }

    public static long cauE(int n){
        long total=0;
        for (int i=1;i<=n;i++){
            total+=giaiThua(i);
        }
        return total;
    }
}
