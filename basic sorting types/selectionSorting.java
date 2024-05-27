public class selectionSorting {
    public static void main(String[] args) {
        int[] ar = {3, 24, 35, 33, 5, 35, 2, 6, 22};
        for (int i = 0; i < ar.length; i++) {
            int smallest = i;
            for (int j = i + 1; j < ar.length; j++) {
                if (ar[smallest] > ar[j]) {
                    smallest = j;
                }
            }
            int temp = ar[smallest];
            ar[smallest] = ar[i];
            ar[i] = temp;
        }
        for (int j : ar) {
            System.out.print(j + " ");
        }
        // here time complexity = O(n^2)
    }
}
