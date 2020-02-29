public class Problem6 {
    public static void main(String[] args) {
        int[] arr = new int[]{55, 44, 88, 99, 66, 32, 15, 1};
        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1]) {
                max = arr[i];
            } else if (arr[i] < arr[i - 1]) {
                min = arr[i];
            }
        }
        System.out.println("Maximum element is: " + max);
        System.out.println("Minimum element is: " + min);
    }
}
