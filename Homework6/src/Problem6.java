import java.util.Arrays;
import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input parenthesis sequence: ");
        String seq = scanner.nextLine();
        char[] chars = seq.toCharArray();
        String a1 = "(";
        String a2 = ")";
        String a3 = "0";
        char b1 = a1.charAt(0);
        char b2 = a2.charAt(0);
        char b3 = a3.charAt(0);
        int x = 0;
        if (chars.length < 2 || chars.length % 2 != 0 || chars[0] == b2||chars[chars.length-1]== b1) {
            System.out.println("Invalid");
        } else {
            g:
            for (int i = 0; i < chars.length; i++) {
                if (chars[i] == b1) {
                    chars[i] = b3;
                    for (int j = 0; j < chars.length; j++) {
                        if (chars[j] == b2) {
                            chars[j] = b3;
                            if(j<i){
                                break g;
                            }else{
                                x+=1;
                                break;
                            }
                        }
                    }
                }
            }if(x==chars.length/2){
                System.out.println("Valid");
            }else{
                System.out.println("Invalid");
            }
        }
    }
}

