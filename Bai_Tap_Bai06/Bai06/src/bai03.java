import java.util.Scanner;

public class bai03 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String a, b;
        System.out.print("Nhap vao lan luoc chuoi a va b de so sanh: ");
        a=sc.nextLine();
        b=sc.nextLine();
        soSanh(a,b);

    }


    public static void soSanh(String a, String b){
        int kq =a.compareTo(b);
        if(kq>0){
            System.out.printf("%s lon hon %s",a,b);
        }else if(kq<0){
            System.out.printf("%s lon hon %s",b,a);
        }
        else {
            System.out.printf("%s va %s bang nhau",a,b);
        }

    }
}
