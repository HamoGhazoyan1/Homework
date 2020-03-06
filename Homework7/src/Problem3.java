public class Problem3 {
    public static void main(String[] args) {
        int a = 8;
        int[] arr = new int[]{75, 54, 8, -3, 2, 8, 67};
        System.out.println(findExist(a, arr));
    }
    static int findExist (int a1, int[] arr1){
        int x = -1;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i]==a1) {
                x = i;
                break;
            }
        }
        return x;
    }
}
