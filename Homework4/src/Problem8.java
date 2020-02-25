import java.util.Scanner;

public class Problem8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input integer: ");
        int n = scanner.nextInt();
        int i = 1;
        int sum = 0;
        String exp="";
        while(i <= n){
            if (i % 2 == 0){
                sum = sum - i;
                exp = exp+"-"+i;
            } else {
                sum = sum + i;
                if(i==1){
                    exp = exp+i;
                }else{
                    exp = exp+"+"+i;
                }

            }
            i++;
        }
        System.out.println(exp+"="+sum);

    }
}
