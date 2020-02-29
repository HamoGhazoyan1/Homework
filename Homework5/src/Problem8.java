public class Problem8 {
        public static void main(String[] args) {
            int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
            int j = arr.length-1;
            int x;
            for (int i = 0; i < (arr.length)/2 ; i++) {
                x = arr[j];
                arr[j]=arr[i];
                arr[i]=x;
                j--;
            }
            for (int l=0;l<arr.length;l++){
                System.out.println(arr[l]);
            }
        }
}
