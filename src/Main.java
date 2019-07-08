import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap so phan tu cua mang 1: ");
        int m = input.nextInt();
        int[] arr1 = new int[m];
        for (int i = 0; i < m; i++) {
            System.out.print("Nhap phan tu thu " + (i + 1) + ": ");
            arr1[i] = input.nextInt();
        }
        System.out.print("Mang 1: ");
        for (int i = 0; i < m; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
        System.out.print("Nhap so phan tu cua mang 2: ");
        int n = input.nextInt();
        int[] arr2 = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap vao phan tu thu " + (i + 1) + " : ");
            arr2[i] = input.nextInt();
        }
        System.out.print("Mang 2: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr2[i] + " ");
        }
        int[] arr3 = creatNewArray(arr1,arr2);
        System.out.println();
        System.out.print("Mang sau khi gop: ");
        printArray(arr3);
    }
    private static void printArray(int array[]) {
        for (int i = 0; i < array.length-1; i++) {
            if (i != 0) {
                System.out.print(", ");
            }
            System.out.print(array[i]);
        }
        System.out.println();
    }

    private static int[] creatNewArray(int arrayA[], int arrayB[]) {
        int length = arrayA.length + arrayB.length;
        int newArray[] = new int[length + 1];
        for (int i = 0; i < arrayA.length; i++) {
            newArray[i] = arrayA[i];
        }
        for (int i = 0; i < arrayB.length; i++) {
            newArray[arrayA.length + i] = arrayB[i];
        }
        return newArray;
    }
}
