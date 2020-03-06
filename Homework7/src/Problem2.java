import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a: ");
        double a = scanner.nextInt();
        System.out.print("Input b: ");
        double b = scanner.nextInt();
        System.out.println(findPercendance(a, b)+"%");

    }
    static double findPercendance (double num1,double num2){
        double per = (num2/num1)*100;
        if (per < 100) {
            return (100-per)/-1;
        }else{
            return per-100;
        }
    }
}
