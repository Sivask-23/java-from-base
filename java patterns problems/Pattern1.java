public class Pattern1 {
    public static void main(String[] args) {
        int c=5;
        int r=4;
        for (int i=0; i<r;i++){  // for each row
            for (int j =0;j<c;j++){ // for each column
                System.out.print("* "); // not println bcs it will set to new line
            }
            System.out.println();
        }
    }
}
