import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number: ");
        int x = scanner.nextInt();
        int i = 1;
        int n =10;
        while(i <= n){
            System.out.println(x+"*"+i+"="+x*i);
            i++;
        }
    }
}
