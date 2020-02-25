import java.util.Scanner;

public class Problem10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input integer: ");
        int n = scanner.nextInt();
        int i = 1;
        int f0 = 0;
        int f1 = 1;
        int fib=0;
        if(n==2){
            fib =1;
        }
        while(i <= n-2){
            fib=f0+f1;
            f0=f1;
            f1=fib;
            i++;
        }
        System.out.println(fib);
    }
}
