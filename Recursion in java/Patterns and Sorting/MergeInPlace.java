import java.util.Arrays;

public class MergeInPlace {
    static void mergeInPlace(int[] ar, int l,int h){
        if (h-l==1){
            return;
        }
        int mid=l+(h-l)/2;
        mergeInPlace(ar,l,mid);
        mergeInPlace(ar,mid,h);
        merge(ar,l,mid,h);
    }
    private static void merge(int[]ar, int l, int mid, int h){
        int [] temp=new int[h-l];
        int i=l;
        int j=mid;
        int k=0;
        while (i<mid && j<h){
            if (ar[i]<ar[j]){
                temp[k++]=ar[i++];
            }else {
                temp[k++]=ar[j++];
            }
        }
        while (i<mid){
            temp[k++]=ar[i++];
        }
        while (j<h){
            temp[k++]=ar[j++];
        }

        for (int m = 0; m < temp.length; m++) {
            ar[l+m]=temp[m];
        }
    }
    public static void main(String[] args) {
        int[] ar={5,4,3,2,1,6,7,4,2,3};
        mergeInPlace(ar,0,ar.length);
        System.out.println(Arrays.toString(ar));

    }
}
