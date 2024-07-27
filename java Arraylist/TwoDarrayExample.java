import java.util.Arrays;

public class TwoDarrayExample {
    public static void main(String[] args) {
        int [][] ar={
                {1,2,3},
                {4,5,6,7,8},
                {7,8,9}
        };
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[i].length; j++) {
                System.out.print(ar[i][j]+" ");
            }
            System.out.println();
        }

        // enhanced for loop
        System.out.println("Enhanced loop");

        for (int [] inner: ar){
            for (int i = 0; i < inner.length; i++) {
                System.out.print(inner[i]+" ");
            }
            System.out.println();
        }
    }
}
