public class Problem9 {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1,2,3,4,5,6,7};
        int[] arr2 = new int[]{1,2,3,4};
        for (int i = 0; i < arr1.length; i++){
            int x=0;
            for (int j = 0; j < arr2.length; j++){
                if (arr1[i] == arr2[j]){
                    break;
                }else{
                    x = x + 1;
                }
            }if ( x == arr2.length){
                System.out.println(arr1[i]+" doesn't occur");
            }
        }
    }
}
