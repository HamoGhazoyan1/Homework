public class Problem2 {
    public static void main(String[] args) {
        byte[] bytes = new byte[]{8, 2, 3, 5, 2};
        int numberOfEvens;
        numberOfEvens = numberOfEvenElements(bytes);
        System.out.println(numberOfEvens);
        bytes[2] = 4;
        numberOfEvens = numberOfEvenElements(bytes);
        System.out.println(numberOfEvens);
    }

    static int numberOfEvenElements (byte[] someArray) {
        int count = 0;
        for (int i = 0; i < someArray.length; i++) {
            if (someArray[i] % 2 == 0 ){
                count++;
            }
        }
        return count;
    }
}
