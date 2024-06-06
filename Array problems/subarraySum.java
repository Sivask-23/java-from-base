public class subarraySum {
    public static void main(String[] args) {
        int[] ar = {1, 4, 0, 0, 3, 10, 5};
        int sum = 7;
        for (int i = 0; i < ar.length; i++) {
            for (int j = i + 1; j < ar.length - 1; j++) {
                if (ar[i] + ar[j] + ar[j + 1] == sum) {
                    System.out.print("index: " + i + "-" + j + "-" + (j + 1));
                }
            }
        }
    }
}
