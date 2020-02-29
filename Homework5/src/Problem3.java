import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] str = new String[]{"one","two","three","four"};
        System.out.print("Input text: ");
        String txt = scanner.next();
        String ok = "";
        for (int i = 0; i < str.length; i++) {
            if (txt.equals(str[i])){
                ok = "Found";
                break;
            }else{
                ok = "Not Found";
            }
        }
        System.out.println(ok);
    }
}
