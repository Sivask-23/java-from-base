public class Pattern8 {
    public static void main(String[] args) {
        int r = 5;
        int k=0;
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j<=i; j++) {
                k++;
                System.out.print((k)+" ");
            }
            System.out.println();
        }
    }
}
