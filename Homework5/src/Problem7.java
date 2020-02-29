public class Problem7 {
    public static void main(String[] args) {
        int[] arr = new int[]{55, 44, 88, 99, 66, 32, 15, 1};
        int[] rev=new int[arr.length];
        int j = 0;
        for (int i = arr.length-1; i >=0 ; i--) {
          rev[j]=arr[i];
          j++;
        }
    }
}
