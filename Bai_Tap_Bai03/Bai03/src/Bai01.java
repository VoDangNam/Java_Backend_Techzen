import java.util.Scanner;

//Bài tập 1: Kiểm tra số chính phương
public class Bai01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;
        double squareRoot;

        do{
            System.out.print("Vui lòng nhập vào số nguyên dương: ");
            x=sc.nextInt();

            if(x<0){
                System.out.print("Bạn đã nhập vào số không phải nguyên dương, vui lòng nhập lại: ");
                x=sc.nextInt();
            }
        }while(x<0);

        squareRoot =Math.sqrt(x);
        if(squareRoot%1==0){
            System.out.printf("Số %d là số chính phương \n",x);
        }else{
            System.out.printf("Số %d không phải là số chính phương",x);
        }
    }
}
