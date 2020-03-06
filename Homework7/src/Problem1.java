import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input an integer: ");
        int a = scanner.nextInt();
        System.out.println("The sum is: " + sumOfDigits(a));
    }

    static int sumOfDigits(int num) {
        int sum = 0;
        while (num != 0) {
            sum = sum + num % 10;
            num = (num - num % 10) / 10;
        }
        return sum;
    }
}
