import java.util.Scanner;

public class Bai02 {
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
      /*  //2a
        System.out.println("Mang sau khi doi so nguyen ti thanh 0 la: ");
        outputArray(changePrimeToZero(arr));
        //2b
        System.out.println("Mang sau khi chen so khong sau so nguyen to la : ");
        outputArray(insertZeroAfterPrime(arr));

        //2c
        System.out.printf("Nhap vao phan tu can xoa: ");
        int k = sc.nextInt();
        System.out.printf("Mang sau khi xoa phan tu %d la: ", k);
        outputArray(deleteElementK(arr, k));*/

        //2d
        System.out.println("Mang sau khi xoa cac so nguyen to la: ");
        outputArray(deleteElementIsPrime(arr));

        //2e
        System.out.print("Nhap vao phan tu can chen: ");
        int iS = sc.nextInt();
        System.out.print("Nhap vao vi tri can chen: ");
        int vT = sc.nextInt();
        System.out.println("Mang sau khi chen la: ");
        outputArray(addElementIntoArray(arr,vT,iS));


    }

    public static int[] addElementIntoArray(int[] a, int index, int element) {
        int[] newArray = new int[a.length + 1];

        for (int i = 0; i < newArray.length; i++) {
            if (i < index) {
                newArray[i] = a[i];
            } else if (i == index) {
                newArray[i] = element;

            } else {
                newArray[i] = a[i - 1];
            }
        }
        return newArray;
    }

    public static int[] deleteElementIsPrime(int[] a) {
        int count = 0;

        for (int e : a) {
            if (isPrime(e)) {
                count++;
            }
        }
        int[] newArr = new int[a.length - count];
        int index = 0;
        for (int i = 0; i < a.length; i++) {
            if (isPrime(a[i])) {
                continue;
            }
            newArr[index] = a[i];
            index++;
        }
        return newArr;
    }

    public static int[] deleteElementK(int[] a, int k) {
        int count = 0;
        for (int e : a) {
            if (e == k) {
                count++;
            }
        }
        int[] newArr = new int[a.length - count];
        int index = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == k) {
                continue;
            }
            newArr[index] = a[i];
            index++;
        }
        return newArr;
    }

    public static int[] changePrimeToZero(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (isPrime(a[i])) {
                a[i] = 0;
            }
        }
        return a;
    }

    public static int[] insertZeroAfterPrime(int[] a) {
        int count = 0;

        for (int e : a) {
            if (isPrime(e)) {
                count++;
            }
        }

        int[] newArray = new int[a.length + count];
        int index = 0;
        for (int i = 0; i < a.length; i++) {
            newArray[index] = a[i];
            index++;
            if (isPrime(a[i])) {
                newArray[index] = 0;
                index++;
            }
        }
        return newArray;
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
