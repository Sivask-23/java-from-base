public class insertionSorting {
    public static void main(String[] args) {
        int[] ar = {3, 24,1,35, 33, 5, 35, 2, 6, 22};
        for (int i = 1; i < ar.length; i++) {
            int current = ar[i];
            int j = i - 1;
            while (j >= 0 && current < ar[j]) {
                ar[j + 1] = ar[j];
                j--;
            }
            ar[j+1]=current;
        }
        for (int k : ar) {
            System.out.print(k + " ");
        }
    }
}
