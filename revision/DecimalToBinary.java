public class DecimalToBinary {
    public static void revArray(int[] ar){
        int l=0;
        int h=ar.length-1;
        int temp=0;
        while (l<h){
            temp=ar[l];
            ar[l]=ar[h];
            ar[h]=temp;
            l++;
            h--;
        }
    }
    public static void main(String[] args) {
        int[]ans=new int[8];
        int n=5;
        int i=0;
        while (n>0){
            ans[i++]=n%2;
            n=n/2;

        }
        revArray(ans);
        for (int j = 0; j < ans.length; j++) {
            System.out.print(ans[j]);
        }
    }
}
