import java.util.Arrays;

public class Problem3 {
    public static void main(String[] args) {
        int[] ints;
        ints = makeArrayWithInterval(100,113);
        System.out.println(Arrays.toString(ints));

    }

    static int[] makeArrayWithInterval (int from, int to ) {
        int[] interval = new int[to - from +1];
        for (int i = 0; i < interval.length; i++){
            interval[i] = from + i;
        }
            return interval;
    }
}
