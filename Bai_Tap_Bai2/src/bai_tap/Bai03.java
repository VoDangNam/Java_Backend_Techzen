package bai_tap;

import java.util.Scanner;

/***Bài 3**
Viết chương trình Java cho phép người dùng nhập vào điểm thi và hệ số của ba môn: Toán, Lý và Hóa. Dựa trên dữ liệu nhập vào, hãy tính điểm trung bình của học sinh theo hệ số. Sau đó in ra:
 - Điểm từng môn
- Hệ số từng môn
- Điểm trung bình của học sinh*/

public class Bai03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float diemToan, diemHoa, diemLy;
        int hsToan, hsLy, hsHoa;
        float diemTrungBinh;

        System.out.print("Nhập vào điểm toán:");
        diemToan = sc.nextFloat();
        System.out.print("Nhập vào hệ số toán:");
        hsToan = sc.nextInt();

        System.out.print("Nhập vào điểm hóa:");
        diemHoa = sc.nextFloat();
        System.out.print("Nhập vào hệ số hóa:");
        hsHoa = sc.nextInt();

        System.out.print("Nhập vào điểm lý:");
        diemLy = sc.nextFloat();
        System.out.print("Nhập vào hệ số lý:");
        hsLy = sc.nextInt();

        System.out.println("Điểm toán: "+diemToan+", hệ số:"+hsToan );
        System.out.println("Điểm lý: "+diemLy+", hệ số:"+hsLy );
        System.out.println("Điểm hóa: "+diemHoa+", hệ số:"+hsHoa );

        diemTrungBinh=((diemToan*hsToan + diemLy*hsLy + diemHoa*hsHoa)/(hsToan +hsLy+hsHoa));

        System.out.print("Điểm trung bình của học sinh là: "+String.format("%.2f",diemTrungBinh));

    }
}
