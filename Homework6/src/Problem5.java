import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input first string: ");
        String str1 = scanner.nextLine();
        System.out.print("Input second string: ");
        String str2 = scanner.nextLine();
        char[] chars1 = str1.toCharArray();
        char[] chars2 = str2.toCharArray();
        int rot = 0;
        boolean ok = false;
        if (chars1.length == chars2.length) {
            int l = chars1.length;
            v:
            for (int i = 0; i < l; i++) {
                for (int j = 0; j < l; j++) {
                    if (chars2[i] == chars1[j]) {
                        rot = j;
                        int x = 0;
                        g:
                        for (int k = 0,f = rot; k < l; k++, f++) {
                            if(f==l){
                                f = 0;
                            }
                            if(chars2[k]==chars1[f]){
                                x+=1;
                            }
                            if(x==l){
                                ok = true;
                                break v;
                            }else {
                                continue g;
                            }
                        }
                    }
                }

            }
            if(ok){
                System.out.println("Is a rotation");
            }else{
                System.out.println("Is not a rotation");
            }
        }else{
            System.out.println("Not equal chars!!!");
        }
    }
}
