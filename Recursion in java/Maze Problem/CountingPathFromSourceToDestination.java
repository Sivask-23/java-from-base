public class CountingPathFromSourceToDestination {
    static int countOfPath(int r, int c) {
        if (r == 1 || c == 1) {
            return 1;
        }
        int left = countOfPath(r - 1, c);
        int right = countOfPath(r, c - 1);
        return left + right;
    }

    public static void main(String[] args) {
        System.out.println(countOfPath(3, 3));
    }
}
