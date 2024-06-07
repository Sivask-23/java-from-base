import java.util.ArrayList;
import java.util.Arrays;

public class arrayAndQueries {
    public static void update(int[] ar,int l, int h, int add){
        for (int i = l; i <=h; i++) {
            ar[i]+=add;
        }
    }
    public static void  printArray(int[] ar){
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[]ar={10,5,20,40};
        int[]qr={0,1,10};
        update(ar,0,1,10);
        printArray(ar);
        update(ar,1,3,20);
        update(ar,2,2,30);
        printArray(ar);
    }
}
