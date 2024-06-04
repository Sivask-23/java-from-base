import java.util.Arrays;
import java.util.Collections;

public class EvenPositionSort {
    public static void main(String[] args) {
        int ar[]={1,2,2,1,3,4,5,2,0};
        int ans[]=new int[ar.length];
        Arrays.sort(ar);
        int end=ar.length-1;
        int start=0;
        for (int i = 0; i < ar.length; i++) {
            if (i%2==0){
                ans[i]=ar[end--];
            }
            else {
                ans[i]=ar[start++];
            }
        }
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ans[i]+" ");
        }
    }
}
