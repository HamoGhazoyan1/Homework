import java.util.Scanner;

public class Problem7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input integer: ");
        int n = scanner.nextInt();
        int i = 1;
        int sum = 0;
        while(i <= n){
            if (i % 2 == 0){
                sum = sum - i;
            } else {
                sum = sum + i;
            }
            i++;
        }
        System.out.println(sum);

    }
}
