public class Pattern5 {
    public static void main(String[] args) {
        int r = 4;
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= (r - i); j++) { // to print spaces
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {  // to print stars after spaces
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
