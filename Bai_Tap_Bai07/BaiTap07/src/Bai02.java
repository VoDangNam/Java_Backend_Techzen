import java.util.Scanner;

public class Bai02 {
    static Scanner sc = new Scanner(System.in);

    public static void nhapThongTin(int index, String[] hoTen, int[] tuoi, String[] gioiTinh, double[] luongCB, double[] diemTB) {
        System.out.print("Ho va ten: ");
        sc.nextLine();
        hoTen[index] = sc.nextLine();

        System.out.print("Tuoi: ");
        tuoi[index] = sc.nextInt();
        sc.nextLine();
        System.out.print("Gioi Tinh: ");
        gioiTinh[index] = sc.nextLine();

        System.out.print("Luong co ban: ");
        luongCB[index] = sc.nextDouble();

        System.out.print("Diem TB dai hoc: ");
        diemTB[index] = sc.nextDouble();
    }

    public static void xuatThongTin(int index, String[] hoTen, int[] tuoi, String[] gioiTinh, double[] luongCB, double[] diemTB) {
        System.out.println("===Nhan Vien thu "+ (index+1));
        System.out.println("Ho ten: "+hoTen[index]);
        System.out.println("Tuoi: "+tuoi[index]);
        System.out.println("Gioi tinh: "+gioiTinh[index]);
        System.out.println("Luong co ban: "+luongCB[index]);
        System.out.println("Diem TB dai hoc: "+diemTB[index]);
    }

    static void main() {
        System.out.print("Nhap so luong nhan vien: ");
        int sl =sc.nextInt();
        String[] hoTen = new String[sl];
        int[] tuoi = new int[sl];
        String[] gioiTinh = new String[sl];
        double[] luongCB = new double[sl];
        double[] diemTB = new double[sl];
        for (int i=0;i<sl;i++){
            nhapThongTin(i,hoTen,tuoi,gioiTinh,luongCB,diemTB);
        }

        System.out.println("====Xuat Thong tin co ban====");
        for (int i=0;i<sl;i++){
            xuatThongTin(i,hoTen,tuoi,gioiTinh,luongCB,diemTB);
        }

    }
}

