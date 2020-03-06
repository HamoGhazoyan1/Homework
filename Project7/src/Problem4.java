import java.util.Arrays;

public class Problem4 {
    public static void main(String[] args) {
        int[] ints = new int []{1, 2, 3, 4, 5, 6, 7};
        swap(ints,0,1);
        System.out.println(Arrays.toString(ints));

    }

    static void swap (int[] arr, int i1, int i2) {
        int tmp = arr[i1];
        arr[i1] = arr[i2];
        arr[i2] = tmp;
    }
}
