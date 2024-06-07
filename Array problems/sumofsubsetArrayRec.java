public class sumofsubsetArrayRec {
    public static void sumOfsub(int[]ar,int l, int h, int sum){
        if (l>h){
            System.out.print(sum+" ");
            return;
        }
        sumOfsub(ar,l+1,h,sum+ar[l]);
        sumOfsub(ar,l+1,h,sum);
    }
    public static void main(String[] args) {
        int[]ar={2,3};
        int n=ar.length-1;
        int sum=0;
        sumOfsub(ar,0,n,sum);
    }
}
