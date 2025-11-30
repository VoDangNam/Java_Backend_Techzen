import java.util.Scanner;

public class Bai01 {
    public static void main(String[] args) {
        String str = " Hello World ";

        System.out.println("a) " + str.substring(6));
        System.out.println("b) " + str.replace("o", "f"));
        System.out.println("c) " + demChuCaiL(str));
        System.out.println("d) Vi Tri Dau La: " + (str.indexOf("l") + 1) + " Vi Tri Cuoi la: " + (str.lastIndexOf("l") + 1));
        System.out.println("e) " + str.replace(" ", ""));
        System.out.println("f) " + str.trim());
        StringBuffer str2 = new StringBuffer();
       /* str2.append(str);
        str2.reverse();
        str = str2.toString();
        System.out.println("h) " + str);*/
        String str3 = "SQC";
        System.out.println("h) "+str3.concat(str));
        System.out.println("i) "+str.toUpperCase());
        System.out.println("k) "+str.toLowerCase());
        trichXuatChuoiCon(str);

    }

    public static void trichXuatChuoiCon(String str){
        Scanner sc =new Scanner(System.in);
        int n, m;
        System.out.println("Nhap vao vi tri dau tien ban muon lay: ");
        n=sc.nextInt();
        System.out.println("Nhap vao vi tri cuoi cung ban muon lay: ");
        m=sc.nextInt();
        System.out.printf("Chuoi tu vi tri bat dau %d toi vi tri cuoi cung %d la: %s",n,m,str.substring(n,m));

    }
    public static int demChuCaiL(String str) {
        int dem = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'l') {
                dem++;
            }
        }
        return dem;
    }
}
