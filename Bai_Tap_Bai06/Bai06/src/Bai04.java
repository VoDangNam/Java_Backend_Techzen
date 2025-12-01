public class Bai04 {
    public static void main(String[] args) {
        String str = " Hello World";

        StringBuffer str2 = new StringBuffer();
        str2.append(str);
        StringBuilder str3 = new StringBuilder();
        str3.append(str);
        System.out.println("StringBuffer: "+str2);
        System.out.println("StringBuilder: "+str3);
        System.out.println(str2.substring(6));
        System.out.println(str3.substring(6));

        thayKiTu(str);

        String strA = "Hello";
        String strB = " World";
        String strC = strA + strB;
        System.out.println("String: "+strC);
        StringBuffer strD = new StringBuffer();
        strD.append(strA).append(strB);
        System.out.println("StringBuffer: "+ strD);
        StringBuilder strE = new StringBuilder();
        strE.append(strA).append(strB);
        System.out.println("StringBuilder: "+ strE);
    }

    public static void thayKiTu(String str) {

        StringBuffer str2 = new StringBuffer();
        str2.append(str);
        for (int i = 1; i <str.length();i++) {
            if(str2.charAt(i)=='o'){
                str2.replace(i,i+1,"f");
            }
        }
        System.out.println(str2);
    }


}
