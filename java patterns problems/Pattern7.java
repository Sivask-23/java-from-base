public class Pattern7 {
    public static void main(String[] args) {
        int r = 5;
        for (int i = r; i >= 1; i--) {
            for (int j = 1; j<=i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }

        // another method

        for (int i = 1; i <= r; i++) {
            for (int j = 1; j<=(r-i)+1; j++) { // better code
                System.out.print(j+" ");
            }
            System.out.println();
        }

    }
}
