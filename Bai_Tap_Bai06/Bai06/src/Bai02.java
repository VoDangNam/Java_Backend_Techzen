public class Bai02 {
    public static void main(String[] args) {
        String str1;
//        a. Chuyển đổi `String` thành `int` <br>

        str1 = "123";
        int so = Integer.parseInt(str1);
        int total = 10 + so;
        System.out.println("a) " + total);

//        b. Chuyển đổi `int` thành `String` <br>

        int number = 1234;
        String str2 = String.valueOf(number);
        String str3 = "Hello "+number;
        System.out.println("b)"+ str3);

    }
}
