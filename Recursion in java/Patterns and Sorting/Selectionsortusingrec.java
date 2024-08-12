import java.util.Arrays;

public class Selectionsortusingrec {
    static void selectSortRec(int [] ar,int i, int j, int max){
        if (i==0){
            return;
        }
        if (j<i) {
            if (ar[j] > ar[max]) {
                selectSortRec(ar, i, j + 1, j);
            }else {
                selectSortRec(ar, i, j+1, max);
            }
        }else {
            swapEle(ar,i-1,max);
            selectSortRec(ar,i-1,0,0);
        }
    }
    private static void swapEle(int[] ar, int i, int j) {
        int temp=ar[i];
        ar[i]=ar[j];
        ar[j]=temp;
    }
    public static void main(String[] args) {
        int[] ar ={4,3,2,1,0,6,5,7,0,0,9,0};
        selectSortRec(ar,ar.length,0,0);
        System.out.println(Arrays.toString(ar));

    }
}
