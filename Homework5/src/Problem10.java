import java.util.Scanner;

public class Problem10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr1 = new int[]{1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 4};
        System.out.print("Input k: ");
        int k = scanner.nextInt();
        boolean ok = false;
        g:
        for (int i = 0; i < arr1.length; i++) {
            int x = 0;
            for (int j = 0; j < arr1.length; j++) {
                if (arr1[i] == arr1[j]) {
                    x++;
                    if(x==k){
                        System.out.println("Element "+arr1[i]+" occurs "+k+" times!!!");
                        ok = true;
                        break g;
                    }
                }
            }
        }
        if (!ok){
            System.out.println("No element that occurs "+k+" times!!!");
        }
    }
}
