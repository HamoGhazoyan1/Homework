import java.util.Scanner;

public class Problem9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input integer: ");
        int n = scanner.nextInt();
        int i = 1;
        int fac = 1;
        while(i <= n){
            fac = fac * i;
            i++;
        }
        System.out.println(n+"!="+fac);

    }
}
