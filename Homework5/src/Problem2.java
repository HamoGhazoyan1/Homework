import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input size of array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Input element " + i + ": ");
            int a = scanner.nextInt();
            arr[i] = a;
        }
        System.out.print("Array is: ");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j]+",");
        }

    }
}
