import java.util.Scanner;

public class Bai01 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n;
        do {
            System.out.print("Nhap so luong phan tu n cua mang: ");
            n = sc.nextInt();
            if (n < 1) {
                System.out.println("Xin vui long nhhap lai");
            }
        } while (n < 1);
        int[] arr = new int[n];
        inputArray(arr);
        System.out.println("Mang da nhap: ");
        outputArray(arr);

    /*    //a
        if (isALLEven(arr)) {
            System.out.println("\nMang toan chan");
        } else {
            System.out.println("\nMang khong toan chan");
        }

        //2b
        if (isPrimeNumberArr(arr)) {
            System.out.println("Mang toan so nguyen to");
        } else {
            System.out.println("Mang khong toan so nguyen to");
        }

        //2c
        if (isAllUp(arr)) {
            System.out.println("Mang tang dan");
        } else {
            System.out.println("Mang ko tang dan");
        }

        //3a
        System.out.println("So luong phan tu la so le co trong mang la: " + countEvenNumber(arr));

        //3b
        System.out.println("Tong so duong le co trong mang cua ban la: " + totalEvenNumber(arr));

        //3c
        System.out.printf("Co %d so chia het cho 4 nhung khong chia het cho 5", countDivisibleBy4NotBy5(arr));

        System.out.println();

        //3d
        System.out.printf("Mang co tong so nguyen la:  %d", totalPrime(arr));

        //4a
        System.out.print("\n Nhap vao so can tim: ");
        int number = sc.nextInt();
        System.out.printf("Vi tri cuoi cung cua %d trong mang la: array[%d]", number, lastIndexOfEInArray(arr, number));

        System.out.println();
        //4b
        int result = fistIndexPrime(arr);
        if (result == -1) {
            System.out.println("Khong co so nguyen to nao");
        } else {
            System.out.printf("Mang co so nguyen to dau tien tai vi tri array[%d]", result);
        }*/

        //4c
        System.out.println("So duong nho nhat trong mang cua ban la: "+minPositiveNumber(arr));

        //4d
        int k;
        System.out.print("Nhap vao phan tu can tim kiem: ");
        k=sc.nextInt();
        foundElementInArray(arr,k);

        //4e

        System.out.println("So nho nhat trong mang la: "+minPositiveNumber(arr));
        System.out.println("So lon nhat trong mang la: "+maxNumberInArray(arr));
    }


    public static void foundElementInArray(int[] a, int k){
        int count=0;
        for(int i=0;i<a.length;i++){
            if(a[i]==k){
                System.out.printf("Phan tu %d da duoc tim thay tai vi tri thu array[%d] \n",k,i);
                count++;
            }
        }if(count == 0){
            System.out.println("Khong tim thay phan tu trong mang");
        }


    }

    public static int maxNumberInArray(int[] a){
        int max=a[0];
        for(int i=0;i<a.length;i++){
            if(max<a[i]){
                max =a[i];
            }
        }
        return max;
    }
    public  static int minPositiveNumber(int[] a){
        int min=a[0];
        for(int i=1;i<a.length;i++){

            if(min>a[i]&& a[i]>0){
                min=a[i];
            }
        }
        return min;
    }
    public static int fistIndexPrime(int[] a) {
        int index = 0;
        for (int i = 0; i < a.length; i++) {
            if (isPrime(a[i])) {
                index = i;
                break;
            } else {
                return -1;
            }
        }
        return index;
    }

    public static int lastIndexOfEInArray(int[] a, int e) {
        int lastIndex = 0;
        for (int i = a.length - 1; i >= 0; i--) {
            if (a[i] == e) {
                lastIndex = i;
                break;
            }
        }
        return lastIndex;
    }

    public static int totalPrime(int[] a) {
        int total = 0;
        for (int j : a) {
            if (isPrime(j)) {
                total += j;
            }
        }
        return total;
    }

    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;

        // chỉ cần kiểm tra đến sqrt(n)
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) return false;
        }

        return true;
    }

    public static int countDivisibleBy4NotBy5(int[] a) {
        int total = 0;
        for (int e : a) {
            if (e % 4 == 0 && e % 5 != 0) {
                total++;
            }
        }
        return total;
    }

    public static int totalEvenNumber(int[] a) {
        int total = 0;
        for (int e : a) {
            if (e % 2 != 0 && e > 0) {
                total += e;
            }
        }
        return total;
    }


    public static int countEvenNumber(int[] a) {
        int count = 0;
        for (int e : a) {
            if (e % 2 != 0) {
                count++;
            }
        }
        return count;
    }

    /// Nhap mang
    public static void inputArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.printf("Nhap vao phan tu array[%d]: ", i);
            a[i] = sc.nextInt();
        }
    }

    public static void outputArray(int[] a) {
        System.out.println("Xuat");
        for (int i = 0; i < a.length; i++) {
            System.out.printf("array[%d]: %d \n", i, a[i]);
        }
    }

    public static boolean isALLEven(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) return false;
        }
        return true;
    }

    static boolean isPrimeNumberArr(int number) {
        if (number < 2) return false;
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) count++;
        }
        return count == 2;
    }

    public static boolean isPrimeNumberArr(int[] array) {
        for (int j : array) {
            if (!isPrimeNumberArr(j)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isAllUp(int[] a) {

        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i + 1] || a[i] == a[i + 1]) {
                return false;
            }
        }
        return true;
    }


}
