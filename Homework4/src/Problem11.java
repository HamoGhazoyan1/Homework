import java.util.Scanner;

public class Problem11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input integer: ");
        int n = scanner.nextInt();
        int i = 2;
        String txt = "NOT PRIME";;
        if(n==2){
            txt = "PRIME";
        }
        while (i < n) {
            if (n % i == 0) {
                break;
            } else {
                txt = "PRIME";
            }
            i++;
        }
        System.out.println(txt);
    }
}
