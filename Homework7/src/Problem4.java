import java.util.Arrays;

public class Problem4 {
    public static void main(String[] args) {
        String[] str = new String[]{"abc", "def", "qw7", "12"};
        String[] rev = reversedStrings(str);
        System.out.println(Arrays.toString(rev));
    }
    static String[] reversedStrings (String[] str1){
        for (int i = 0; i < str1.length; i++) {
            char[] chars = str1[i].toCharArray();
            for (int j = 0; j < chars.length/2; j++) {
                char x = chars[j];
                chars[j] = chars[chars.length-1-j];
                chars[chars.length-1-j] = x;
                str1[i]="";
                for (int k = 0; k < chars.length; k++) {
                    str1[i]+=chars[k];
                }
            }
        }
        return str1;
    }
}
