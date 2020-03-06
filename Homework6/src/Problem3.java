import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input string: ");
        String str = scanner.next();
        char[] chars = str.toCharArray();
        boolean pal = false;
        for (int i = 0; i < chars.length/2+1; i++) {
            if(chars[i]==chars[chars.length-1-i]){
                pal = true;
            }
            else{
                pal=false;
                break;
            }
        }
        if(pal){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
    }
}
