package bai_tap;

/*
Bài 4
Viết chương trình Java cho phép người dùng nhập vào bán kính của một hình tròn. Dựa trên giá trị bán kính, hãy tính:
        1. Chu vi hình tròn
2. Diện tích hình tròn

Sau đó hiển thị ra màn hình:
        - Bán kính đã nhập
- Chu vi của hình tròn
- Diện tích của hình tròn
*/

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Bai04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final float pi= 3.14f;
        double r ;
        double chuVi;
        double dienTich;

        System.out.print("Vui lòng nhập vào bán kính (r):");
        r=sc.nextFloat();
        System.out.println("Bán kính hình tròn bạn đã nhập là :"+r);
        chuVi= 2*pi*r;
        System.out.println("Chu Vi hình tròn của bạn là: "+String.format("%.4f",chuVi));
        dienTich=pi* r*r;
        System.out.println("Diện tích hình tròn của bạn là: "+String.format("%.4f",dienTich));

    }
}
