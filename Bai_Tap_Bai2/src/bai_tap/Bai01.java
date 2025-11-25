package bai_tap;

import java.util.Scanner;

/*
A gửi bài tập
**Bài 1:**
Viết một chương trình Java cho phép người dùng nhập vào hai số nguyên a và b. Chương trình thực hiện
 các phép toán số học cơ bản giữa hai số bao gồm: tổng, hiệu,
  tích và thương, sau đó hiển thị kết quả ra màn hình.

**Yêu cầu chi tiết**
        - Nhập từ bàn phím hai số nguyên a và b.
        - Tính và in ra:
        - Tổng của a và b
- Hiệu của a và b
- Tích của a và b
- Thương của a chia b
- Xử lý trường hợp b = 0 để tránh lỗi chia cho 0.

        **Mục tiêu:**
Làm quen với nhập — xuất dữ liệu trong Java và thực hiện các phép toán số học cơ bản giữa hai số nguyên.
*/
public class Bai01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b;
        System.out.print("Nhập vào số a : ");
        a=sc.nextInt();
        System.out.print("Nhập vào số b : ");
        b=sc.nextInt();

        System.out.printf("%d + %d = %d \n",a,b,(a+b));
        System.out.printf("%d - %d = %d \n",a,b,(a-b));
        System.out.printf("%d x %d = %d \n",a,b,(a*b));

        while(b==0){
            System.out.print("Vui lòng nhập lại b để thực hiện phép chia: ");
            b=sc.nextInt();
        }
        System.out.printf("%d / %d = %d ",a,b,(a/b));
    }
}
