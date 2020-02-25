import java.util.Scanner;

public class Problem12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input integer: ");
        int n = scanner.nextInt();
        int i = 1;
        int n1 = n;
        int i1 = i;
        String b = "black-";
        String w = "white-";
        String txt1 = "";
        String txt2 = "";
        while (i <= n) {
            if (i % 2 == 0) {
                txt1 = txt1 + w;
                txt2 = txt2 + b;
            }else {
                txt1 = txt1 + b;
                txt2 = txt2 + w;
            }
            i++;
        }
        while (i1 <= n1) {
            if (i1 % 2 == 0) {
                System.out.println(txt2);
            }else {
                System.out.println(txt1);
            }
            i1++;
        }
    }
}
