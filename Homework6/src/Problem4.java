import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a string: ");
        String str = scanner.next();
        System.out.print("Input number of rotations: ");
        int r = scanner.nextInt();
        char[] chars = str.toCharArray();
        char[] newChars = new char[chars.length];
        int f = r;
        for (int i = 0; i < chars.length; i++) {
            if(i==chars.length-f){
                r=0;
            }
            newChars[i]=chars[r];
            r++;
        }
        for (int j = 0; j < newChars.length; j++) {
            System.out.print(newChars[j]);
        }
    }
}
