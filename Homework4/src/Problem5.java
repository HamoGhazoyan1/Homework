import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input x: ");
        int x = scanner.nextInt();
        System.out.println("Input y: ");
        int y = scanner.nextInt();
        int sum = 0;
        while (x <= y){
            if (x % 9 == 0){
                System.out.println(x);
                sum = sum + x;
            }
            x++;
        }
        System.out.println(sum);
    }
}
