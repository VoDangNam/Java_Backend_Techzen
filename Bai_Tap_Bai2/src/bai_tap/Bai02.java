package bai_tap;
/*

**Bài 2**
Viết chương trình Java cho phép người dùng nhập vào tên sản phẩm,
 số lượng và đơn giá của sản phẩm. Dựa trên dữ liệu nhập vào, hãy tính:

        1. Tiền hàng (chưa bao gồm thuế)
→ Công thức: tiền hàng = số lượng × đơn giá

2. Thuế giá trị gia tăng (VAT)
→ Thuế VAT được tính theo 10% của tiền hàng.

3. Tổng tiền phải thanh toán
→ tổng tiền = tiền hàng + thuế VAT
        Cuối cùng, hiển thị đầy đủ các thông tin: tên sản phẩm, số lượng,
         đơn giá, tiền hàng, tiền thuế và tổng tiền phải trả.

        **Mục tiêu**
Rèn luyện kỹ năng nhập dữ liệu từ bàn phím và thực hiện các phép tính đơn giản
 trong Java để tính toán tiền hàng và thuế VAT cho một sản phẩm.
*/

import java.util.Scanner;

public class Bai02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soLuong =0 ;
        double donGia =0 ;
        String tenSanPham;

        double tienHang;

        double VAT;

        double tongTien;
        System.out.print("Nhập vào tên sản phẩm: ");
        tenSanPham = scanner.nextLine();
        System.out.print("Nhập số lượng: ");
        soLuong = scanner.nextInt();
        System.out.print("Nhập vào đơn giá của sản phẩm: ");
        donGia = scanner.nextDouble();

        System.out.println("Thông tin sản phẩm: ");
        System.out.println("Tên sản phẩm : "+tenSanPham);
        System.out.println("Số lượng : "+ soLuong);
        System.out.println("Đơn giá : "+donGia);
        tienHang = soLuong * donGia;
        System.out.println("Tiền hàng: "+tienHang);
        VAT = tienHang * 0.1;
        System.out.println("Tiền VAT:" +VAT);
        tongTien = tienHang + VAT;
        System.out.println("Tông tiền là: "+tongTien);



    }

}
