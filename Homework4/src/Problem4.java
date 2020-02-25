import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input x: ");
        int x = scanner.nextInt();
        System.out.println("Input y: ");
        int y = scanner.nextInt();
        int i = 1;
        int z = 1;
        while(i <= y){
            z = z * x;
            i++;
        }
        System.out.println(z);
    }
}
