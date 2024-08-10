import java.util.Arrays;

public class BublesortRec {
    static void bSort(int[] ar,int i, int j){

        if (i==0){
            return;
        }
        if (j<i) {
            if (ar[j] > ar[j + 1]) {
                swapEle(ar, j, j + 1);
            }
            bSort(ar, i, j + 1);
        } else {
            bSort(ar, i-1, 0);
        }
    }

    private static void swapEle(int[] ar, int i, int j) {
        int temp=ar[i];
        ar[i]=ar[j];
        ar[j]=temp;
    }

    public static void main(String[] args) {
        int [] ar={4,3,2,1,0,1,2};
        bSort(ar,ar.length-1,0);
        System.out.println(Arrays.toString(ar));
    }
}
