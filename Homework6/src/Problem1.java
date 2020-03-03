import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a string: ");
        String str = scanner.next();
        System.out.print("Input an index: ");
        int index = scanner.nextInt();
        char[] chars = str.toCharArray();
        if(index < 0 || index > chars.length-1){
            System.out.println("Out of bounds!!!");
        }else{
            for (int i = 0; i < chars.length; i++) {
                if(chars[i]==str.charAt(index)){
                    System.out.println("Character at index "+i+" is "+chars[i]);
                };
            }
        }
    }
}
