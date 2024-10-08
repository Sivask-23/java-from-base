import java.util.Arrays;

public class FlipAnImage {
    static int[][] flipAndInvert(int[][] ar){
        for (int [] row : ar){
//            reverse
            for (int i = 0; i < (row.length+1)/2; i++) {
                int temp=row[i] ^ 1;
                row[i]=row[row.length-i-1] ^ 1;
                row[row.length-i-1]=temp;
            }
        }
        return ar;
    }
    public static void main(String[] args) {

        int[][] image={
                {1,1,0},
                {1,0,1},
                {0,0,0}
        };
        System.out.println(Arrays.deepToString(image));
        System.out.println(Arrays.deepToString(flipAndInvert(image)));
    }
}
