public class Pattern4 {
    public static void main(String[] args) {
        int r = 4;
        for (int i = 1; i <= r; i++) {
            for (int j = r; j>=i; j--) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
