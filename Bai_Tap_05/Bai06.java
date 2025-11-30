package Bai05.bai_tap;


import java.util.Scanner;

public class Bai06 {
    public static void main(String[] args) {
            NhanVien nv = new NhanVien();
            nv.nhapTT();
            nv.xuatTT();
    }


    static class NhanVien {
        //    họ tên, tuổi, giới tính, mức lương cơ bản, điểm trung bình tốt nghiệp đại học (theo thang điểm 10
        public String hoTen;
        public String gioiTinh;
        public double luongCB;
        public double diemTB;

        public NhanVien() {
        }


        public void nhapTT() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhap vao thong tin nhan vien");
            System.out.print("Ho va Ten: ");
            hoTen = sc.nextLine();
            System.out.print("Gioi Tinh (nam/nu): ");
            gioiTinh = sc.nextLine().toLowerCase();
            System.out.print("Luong co ban: ");
            luongCB = sc.nextDouble();
            System.out.print("Diem trung binh (thang diem 10): ");
            diemTB = sc.nextDouble();
            sc.nextLine();
        }

        public  void xuatTT() {
            System.out.println("Thong tin nhan vien " + hoTen);
            System.out.println("Ho va Ten: " + hoTen);
            System.out.println("Gioi Tinh: " + gioiTinh);
            System.out.println("Luong co ban: " + luongCB);
            System.out.println("Diem trung binh: " + diemTB);
        }


    }
}

