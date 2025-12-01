public class Bai02 {
    public static void main(String[] args) {

        //a
        System.out.println("Cau a) ");
        String dlBanDau1 ="123";
        int dlSauKhiEp1 = Integer.parseInt(dlBanDau1);
        System.out.println("Ket Qua: "+dlSauKhiEp1);
        System.out.println("Kieu Dl cua ket qua: "+((Object)dlSauKhiEp1).getClass().getSimpleName());

        //b
        System.out.println("Cau b) ");
        int dlBanDau2 =123;
        String dlSauKhiEp2 = String.valueOf(dlBanDau2);
        System.out.println("Ket Qua: "+dlSauKhiEp2);
        System.out.println("Kieu Dl cua ket qua: "+dlSauKhiEp2.getClass().getSimpleName());

        //c
        System.out.println("Cau c) ");
        String dlBanDau3 ="123";
        long dlSauKhiEp3 = Long.parseLong(dlBanDau3);
        System.out.println("Ket Qua: "+dlSauKhiEp3);
        System.out.println("Kieu Dl cua ket qua: "+((Object)dlSauKhiEp3).getClass().getSimpleName());

        //d
        System.out.println("Cau d) ");
        long dlBanDau4 =123;
        String dlSauKhiEp4 = String.valueOf(dlBanDau4);
        System.out.println("Ket Qua: "+dlSauKhiEp4);
        System.out.println("Kieu Dl cua ket qua: "+dlSauKhiEp4.getClass().getSimpleName());

        //e
        System.out.println("Cau e) ");
        String dlBanDau5 ="123";
        float dlSauKhiEp5 = Float.parseFloat(dlBanDau5);
        System.out.println("Ket Qua: "+dlSauKhiEp5);
        System.out.println("Kieu Dl cua ket qua: "+((Object)dlSauKhiEp5).getClass().getSimpleName());

        //f
        System.out.println("Cau f) ");
        float dlBanDau6 =123;
        String dlSauKhiEp6 = String.valueOf(dlBanDau6);
        System.out.println("Ket Qua: "+dlSauKhiEp6);
        System.out.println("Kieu Dl cua ket qua: "+dlSauKhiEp6.getClass().getSimpleName());

        //g
        System.out.println("Cau g) ");
        String dlBanDau7 ="123";
        double dlSauKhiEp7 = Double.parseDouble(dlBanDau7);
        System.out.println("Ket Qua: "+dlSauKhiEp7);
        System.out.println("Kieu Dl cua ket qua: "+((Object)dlSauKhiEp7).getClass().getSimpleName());

        //h
        System.out.println("Cau h) ");
        double dlBanDau8 =123;
        String dlSauKhiEp8 = String.valueOf(dlBanDau8);
        System.out.println("Ket Qua: "+dlSauKhiEp8);
        System.out.println("Kieu Dl cua ket qua: "+dlSauKhiEp8.getClass().getSimpleName());

        //i
        System.out.println("Cau i) ");
        String dlBanDau9 ="123";
        short dlSauKhiEp9 = Short.parseShort(dlBanDau9);
        System.out.println("Ket Qua: "+dlSauKhiEp9);
        System.out.println("Kieu Dl cua ket qua: "+((Object)dlSauKhiEp9).getClass().getSimpleName());

        //k
        System.out.println("Cau k) ");
        short dlBanDau10 =123;
        String dlSauKhiEp10 = String.valueOf(dlBanDau10);
        System.out.println("Ket Qua: "+dlSauKhiEp10);
        System.out.println("Kieu Dl cua ket qua: "+dlSauKhiEp10.getClass().getSimpleName());

    }
}
