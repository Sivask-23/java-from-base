import java.util.Arrays;

public class MergeSortUsingRec {
    static int[] mergeSort(int [] ar){
        if (ar.length==1){
            return ar;
        }
        int mid=ar.length/2;
        int []left=mergeSort(Arrays.copyOfRange(ar,0,mid));
        int []right=mergeSort(Arrays.copyOfRange(ar,mid,ar.length));
        return merge(left,right);
    }
    private static int[] merge(int[] firstAr, int[] secondAr){

        int []ans=new int[firstAr.length+secondAr.length];
        int i=0;
        int j=0;
        int k=0;
        while (i< firstAr.length && j< secondAr.length){
            if (firstAr[i]<secondAr[j]){
                ans[k++]=firstAr[i];
                i++;
            }else {
                ans[k++]=secondAr[j];
                j++;
            }
        }
       while (i< firstAr.length){
            ans[k++]=firstAr[i++];
        }
       while (j< secondAr.length){
           ans[k++]=secondAr[j++];
       }
       return ans;

    }
    public static void main(String[] args) {

        int [] ar={6,54,4,3,2,1,0,4,9,0};
        int [] finalans=mergeSort(ar);
        System.out.println(Arrays.toString(finalans));
    }
}
