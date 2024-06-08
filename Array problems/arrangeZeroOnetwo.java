public class arrangeZeroOnetwo {
    public static void main(String[] args) {
        int[]ar={0, 1, 2, 0, 1, 2};
        int l=0;
        int h=ar.length-1;
        int index=0;
        while (index<=h){
            if (ar[index]==0){
                int temp=ar[index];
                ar[index]=ar[l];
                ar[l]=temp;
                l++;
                index++;
            } else if (ar[index]==2) {
                int temp=ar[h];
                ar[h]=ar[index];
                ar[index]=temp;
                h--;
            }else {
                index++;
            }
        }

        for (int k = 0; k < ar.length; k++) {
            System.out.print(ar[k]+" ");
        }
    }
}

