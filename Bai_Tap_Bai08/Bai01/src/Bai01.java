import java.util.Scanner;

public class Bai01 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n;
        do {
            System.out.print("Nhap vao so luong phan tu (n>0): ");
            n = sc.nextInt();
            if (n <= 0) {
                System.out.println("Vui long nhap so duong (n>0)!");
            }
        } while (n <= 0);

        int[] arr = new int[n];

        inputArray(arr);
        System.out.println("Mang da nhap: ");
        outputArray(arr);


        //1a
        System.out.println("Mang B chua so nguyen to o mang A la: ");
        int[] b = extracPrimeNumber(arr);
        outputArray(b);

        //1b
        System.out.println("Mang co so duong ");
        int[] positive = extracPositiveNumber(arr);
        outputArray(positive);

        System.out.println("Mang co so con lai ");
        int[] remaining = remainingNumber(arr, positive);
        outputArray(remaining);

        //1c
        System.out.println("Mang sau khi sap xep giam dan la");
        int[] sort = sortArrayDesc(arr);
        outputArray(sort);

        //1d
        System.out.println("Mang sau khi sap xep theo yeu cau(duong giam||am tang|| so 0): ");
        outputArray(sortArray(arr));

        //1e
        System.out.println("Mang sau khi dao: ");
        outputArray(reverseAray(arr));

        //1f
        boolean kQF=inspectArrayIsSymmetric(arr);
        if(kQF){
            System.out.println("Mang la mang doi xung");
        }else {
            System.out.println("Mang ko phai la mang doi xung");
        }

        //1g
        System.out.printf("Mang co %d cap so doi xung",countSymmetric(arr));

    }

    public static int countSymmetric(int[] a){
        int LIndex =a.length-1;
        int count =0;
        for(int i=0;i<a.length/2;i++ ){
            if(a[i] == a[LIndex]){
                count++;
                LIndex--;
            }else {
                LIndex--;
            }
        }
        return count;
    }
    public static boolean inspectArrayIsSymmetric (int[] a){
        int LIndex =a.length-1;
        for(int i=0;i<a.length/2;i++){
            if(a[i]!=a[LIndex]){
                return false;
            }
            LIndex--;
        }
        return true;

    }


  /*  public static int[] reverseAray(int[] a){
        int[] newArray = new int[a.length];
        int index=0;
        for(int i=a.length-1;i>=0;i--){
            newArray[index] = a[i];
            index++;
        }
        return newArray;
    }

*/

    public static int[] reverseAray(int[] a){
        int lastID = a.length-1;
        int temp;
        for(int i=0;i<a.length/2;i++){
            temp = a[i];
            a[i] = a[lastID];
            a[lastID] =temp;
            lastID--;
        }
        return a;
    }
    public static int[] sortArray(int[] a) {
        int[] positive = extracPositiveNumber(a);
        sortArrayDesc(positive);

        int[] negative = extracNegativeNumber(a);
        sortArrayUp(negative);

        int index = 0;
        int[] result = new int[a.length];
        for (int e : positive) {
            result[index] = e;
            index++;
        }
        for (int e : negative) {
            result[index] = e;
            index++;
        }
        return result;
    }

    public static int[] sortArrayDesc(int[] a) {
        int temp;
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] < a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a;
    }

    public static int[] sortArrayUp(int[] a) {
        int temp;
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a;
    }

    public static int[] extracPositiveNumber(int[] a) {
        int count = 0;
        for (int e : a) {
            if (e > 0) {
                count++;
            }
        }
        int[] newArr = new int[count];
        int index = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > 0) {
                newArr[index] = a[i];
                index++;
            }
        }
        return newArr;
    }

    public static int[] extracNegativeNumber(int[] a) {
        int count = 0;
        for (int e : a) {
            if (e < 0) {
                count++;
            }
        }
        int[] newArr = new int[count];
        int index = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 0) {
                newArr[index] = a[i];
                index++;
            }
        }
        return newArr;
    }

    public static int[] remainingNumber(int[] a, int[] positiveNum) {
        int count = 0;
        for (int e : a) {
            if (e <= 0) {
                count++;
            }
        }
        int[] newArr = new int[count];
        int index = 0;
        for (int e : a) {
            if (e <= 0) {
                newArr[index] = e;
                index++;
            }
        }

        return newArr;
    }

    public static int[] extracPrimeNumber(int[] a) {
        int count = 0;
        for (int e : a) {
            if (isPrime(e)) {
                count++;
            }
        }
        int[] newArr = new int[count];
        int index = 0;
        for (int j : a) {
            if (isPrime(j)) {
                newArr[index] = j;
                index++;
            }
        }
        return newArr;
    }

    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;

        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }

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
}
