public class equilIndexOfArrayEfficientMethod {
    public static int findequiIndex(int [] ar, int n){

        int totalSum=0;
        for (int i = 0; i < ar.length; i++) {
            totalSum+=ar[i];
        }
        int leftSum=0;
        for (int i = 0; i <= n; i++) {
            leftSum+=ar[i];
                if (leftSum==totalSum){
                    return i;
                }
                totalSum-=ar[i];
        }
        return -1;

    }
    public static void main(String[] args) {
        int[]ar={6, -1, 5, -2, 4, 3, 0};
        int n=ar.length-1;
        System.out.println(ar[findequiIndex(ar,n)]+" is the equilibrium element with index "+findequiIndex(ar,n));
    }
}
