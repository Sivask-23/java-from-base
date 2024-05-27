public class twoDarray {
    public static void main(String[] args) {
//        int[][] a = new int[3][4]; // [rows][column]
        int [][] a = {{1,2,3,4},{2,3,1,4},{4,1,23,0}};
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(a[i][j]+"  ");
            }
            System.out.println();

        }
    }
}
