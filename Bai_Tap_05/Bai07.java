package Bai05.bai_tap;

import java.util.Scanner;

public class Bai07 {
    static Scanner sc = new Scanner(System.in);


    static String hoTen1, gioiTinh1;
    static double luongCB1, diemTB1;
    static int tuoi1;

    static String hoTen2, gioiTinh2;
    static double luongCB2, diemTB2;
    static int tuoi2;

    static String hoTen3, gioiTinh3;
    static double luongCB3, diemTB3;
    static int tuoi3;

    static String hoTen4, gioiTinh4;
    static double luongCB4, diemTB4;
    static int tuoi4;

    static String hoTen5, gioiTinh5;
    static double luongCB5, diemTB5;
    static int tuoi5;


    public static void main(String[] args) {
        System.out.print("Nhap so luong nhan vien (1-5): ");
        int n = sc.nextInt();
        sc.nextLine();

        switch (n) {
            case 5:
                nhapNV5();
            case 4:
                nhapNV4();
            case 3:
                nhapNV3();
            case 2:
                nhapNV2();
            case 1:
                nhapNV1();
        }

        switch (n) {
            case 5:
                xuatNV5();
            case 4:
                xuatNV4();
            case 3:
                xuatNV3();
            case 2:
                xuatNV2();
            case 1:
                xuatNV1();
        }
    }


    static void nhapNV1() {
        System.out.println("Nhap thong tin nhan vien 1:");
        System.out.print("Ho ten: ");
        hoTen1 = sc.nextLine();
        System.out.print("Tuoi: ");
        tuoi1 = sc.nextInt();
        sc.nextLine();
        System.out.print("Gioi tinh: ");
        gioiTinh1 = sc.nextLine();
        System.out.print("Luong co ban: ");
        luongCB1 = sc.nextDouble();
        System.out.print("Diem trung binh: ");
        diemTB1 = sc.nextDouble();
        sc.nextLine();
    }

    static void nhapNV2() {
        System.out.println("Nhap thong tin nhan vien 2:");
        System.out.print("Ho ten: ");
        hoTen2 = sc.nextLine();
        System.out.print("Tuoi: ");
        tuoi2 = sc.nextInt();
        sc.nextLine();
        System.out.print("Gioi tinh: ");
        gioiTinh2 = sc.nextLine();
        System.out.print("Luong co ban: ");
        luongCB2 = sc.nextDouble();
        System.out.print("Diem trung binh: ");
        diemTB2 = sc.nextDouble();
        sc.nextLine();
    }

    static void nhapNV3() {
        System.out.println("Nhap thong tin nhan vien 3:");
        System.out.print("Ho ten: ");
        hoTen3 = sc.nextLine();
        System.out.print("Tuoi: ");
        tuoi3 = sc.nextInt();
        sc.nextLine();
        System.out.print("Gioi tinh: ");
        gioiTinh3 = sc.nextLine();
        System.out.print("Luong co ban: ");
        luongCB3 = sc.nextDouble();
        System.out.print("Diem trung binh: ");
        diemTB3 = sc.nextDouble();
        sc.nextLine();
    }

    static void nhapNV4() {
        System.out.println("Nhap thong tin nhan vien 4:");
        System.out.print("Ho ten: ");
        hoTen4 = sc.nextLine();
        System.out.print("Tuoi: ");
        tuoi4 = sc.nextInt();
        sc.nextLine();
        System.out.print("Gioi tinh: ");
        gioiTinh4 = sc.nextLine();
        System.out.print("Luong co ban: ");
        luongCB4 = sc.nextDouble();
        System.out.print("Diem trung binh: ");
        diemTB4 = sc.nextDouble();
        sc.nextLine();
    }

    static void nhapNV5() {
        System.out.println("Nhap thong tin nhan vien 5:");
        System.out.print("Ho ten: ");
        hoTen5 = sc.nextLine();
        System.out.print("Tuoi: ");
        tuoi5 = sc.nextInt();
        sc.nextLine();
        System.out.print("Gioi tinh: ");
        gioiTinh5 = sc.nextLine();
        System.out.print("Luong co ban: ");
        luongCB5 = sc.nextDouble();
        System.out.print("Diem trung binh: ");
        diemTB5 = sc.nextDouble();
        sc.nextLine();
    }

    static void xuatNV1() {
        System.out.println("\n--- Nhan vien 1 ---");
        System.out.println("Ho ten: " + hoTen1);
        System.out.println("Tuoi: " + tuoi1);
        System.out.println("Gioi tinh: " + gioiTinh1);
        System.out.println("Luong co ban: " + luongCB1);
        System.out.println("Diem TB: " + diemTB1);
    }

    static void xuatNV2() {
        System.out.println("\n--- Nhan vien 2 ---");
        System.out.println("Ho ten: " + hoTen2);
        System.out.println("Tuoi: " + tuoi2);
        System.out.println("Gioi tinh: " + gioiTinh2);
        System.out.println("Luong co ban: " + luongCB2);
        System.out.println("Diem TB: " + diemTB2);
    }

    static void xuatNV3() {
        System.out.println("\n--- Nhan vien 3 ---");
        System.out.println("Ho ten: " + hoTen3);
        System.out.println("Tuoi: " + tuoi3);
        System.out.println("Gioi tinh: " + gioiTinh3);
        System.out.println("Luong co ban: " + luongCB3);
        System.out.println("Diem TB: " + diemTB3);
    }

    static void xuatNV4() {
        System.out.println("\n--- Nhan vien 4 ---");
        System.out.println("Ho ten: " + hoTen4);
        System.out.println("Tuoi: " + tuoi4);
        System.out.println("Gioi tinh: " + gioiTinh4);
        System.out.println("Luong co ban: " + luongCB4);
        System.out.println("Diem TB: " + diemTB4);
    }

    static void xuatNV5() {
        System.out.println("\n--- Nhan vien 5 ---");
        System.out.println("Ho ten: " + hoTen5);
        System.out.println("Tuoi: " + tuoi5);
        System.out.println("Gioi tinh: " + gioiTinh5);
        System.out.println("Luong co ban: " + luongCB5);
        System.out.println("Diem TB: " + diemTB5);
    }

}
