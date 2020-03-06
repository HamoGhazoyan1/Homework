import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input an integer: ");
        int a = scanner.nextInt();
        System.out.println(countZeros(a));
    }
    static boolean countZeros (int a1) {
        int count = 0;
        boolean even = false;
        if(a1 == 0){
            count = 1;
        }else{
            while(a1 != 0){
                int x = a1 % 10;
                if (x==0) {
                    count += 1;
                }
                a1 = (a1 - x) / 10;
            }
        }
        if(count % 2 == 0){
            even = true;
        }
        return even;
    }
}
