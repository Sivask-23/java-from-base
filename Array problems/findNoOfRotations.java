import java.util.Arrays;

public class findNoOfRotations {
    public static void main(String[] args) {
        int[] ar={3,4,5,1,2};
        int small=ar[0];
        int ans=0;
        for (int i = 0; i < ar.length; i++) {
            if (ar[i]<small){
                small=ar[i];
                ans=i;
            }
        }
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i]+" ");
        }
        System.out.println();
        System.out.println("Number of rot is:");
        System.out.println(ans);
    }
}
