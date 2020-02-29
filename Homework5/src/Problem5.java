import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] str = new String[]{"a", "b", "c", "d", "b", "b", "d", "d", "d", "a", "b", "c"};
        System.out.print("Input a char: ");
        String txt = scanner.next();
        int x = 0;
        for (int i = 0; i < str.length; i++) {
            if (txt.equals(str[i])) {
                x = x + 1;
            }
        }
        System.out.println("Char occurs " + x + " times");
    }
}
