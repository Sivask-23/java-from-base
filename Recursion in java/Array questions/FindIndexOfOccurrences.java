import java.util.ArrayList;

public class FindIndexOfOccurrences {
    static ArrayList<Integer> list = new ArrayList<>();
    static void findIndexHelper(int[] ar, int target, int i) {
        if (i == ar.length) {
            return;
        }
        if (ar[i] == target) {
            list.add(i);
        }
        findIndexHelper(ar, target, i + 1);
    }

    public static void main(String[] args) {

        int[] ar = {1, 4, 2, 5, 2, 1};
        findIndexHelper(ar, 2, 0);
        System.out.println(list);

    }
}
