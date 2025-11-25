package bai_tap;

/*
**Bài 5**
Viết chương trình Java cho phép người dùng nhập vào biển số xe (gồm tối đa 5 chữ số).
* Chương trình thực hiện việc tính số nút của biển số xe theo quy tắc:

        1. Cộng tất cả các chữ số trong biển số xe.
        2. Nếu tổng lớn hơn 9, chỉ lấy chữ số hàng đơn vị của tổng làm số nút.

        **Ví dụ:** Biển số: 12345
        → Tổng: 1 + 2 + 3 + 4 + 5 = 15
        → Số nút = chữ số hàng đơn vị của 15 = 5

        Cuối cùng, hiển thị số nút (số điểm) tương ứng với biển số xe.
*/

import java.util.Scanner;

public class Bai05 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bienSoXe;
        int doDai;
        int temp;
        int tong=0;
        do{
            System.out.print("Vui lòng nhập vào biển số xe (tối đa 5 chữ số):");
            bienSoXe=sc.nextInt();
             doDai = String.valueOf(bienSoXe).length();
            if(doDai>5){
                System.out.println("Bạn đã nhập hơn 5 chữ số!!!");
            }
        }while (doDai>5);
        for(int i=0;i<doDai;i++){
            temp = bienSoXe%10;   //5
            bienSoXe =bienSoXe/10; //1234
            tong+=temp;
        }
        System.out.println("Điểm của xe bạn là: "+(tong%10));



    }
}
