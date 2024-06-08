public class equilibriumIndexofArray {
    public static int findEquilibriumIndex(int [] ar, int n){
        int lsum,rsum;
        for (int i = 0; i < ar.length; i++) {
            lsum=0;
            for (int j = 0; j < i; j++) {
                lsum+=ar[j];
            }

            rsum=0;
            for (int j = i+1; j < n; j++) {
                rsum+=ar[j];
            }

            if (lsum==rsum){
                return i;
            }

        }

        return -1;

    }
    public static void main(String[] args) {
        int[] ar={6, -1, 5, -2, 4, 3, 0};
        int n=ar.length-1;
        if (findEquilibriumIndex(ar,n)==-1){
            System.out.println("-1");
        }
        System.out.println(ar[findEquilibriumIndex(ar,n)]+" is the equilibrium element having index "+findEquilibriumIndex(ar,n));
    }
}
