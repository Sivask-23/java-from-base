public class bbleSort {
    public static void main(String[] args) {
        int[] ar = {74, 64, 5, 4, 3, 2, 1};
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar.length - 1 - i; j++) {
                if (ar[j] > ar[j + 1]) {
                    int temp = ar[j];
                    ar[j] = ar[j + 1];
                    ar[j + 1] = temp;
                }
            }
        }

        for (int i : ar) {
            System.out.print(i + " ");
        }
    }
}
