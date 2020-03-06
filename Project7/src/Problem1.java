public class Problem1 {
    public static void main(String[] args) {
        byte[] bytes = new byte[]{8, 2, 3, 4, 2};
        printByteArray(bytes);
        bytes[0]*=3;
        bytes[4]-=2;
        printByteArray(bytes);
    }

    static void printByteArray (byte[] someArray) {
        for (int i = 0; i < someArray.length; i++) {
            System.out.println(someArray[i]);
        }
    }
}
