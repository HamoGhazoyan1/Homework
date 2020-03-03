import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input text: ");
        String str = scanner.nextLine();
        char[] chars = str.toCharArray();
        int num = 1;
        String s = " " ;
        char space = s.charAt(0);
        for (int i = 0; i < chars.length; i++) {
            if(chars[i]==space){
                num=num+1;
            }
        }
        System.out.println(num);
    }
}
