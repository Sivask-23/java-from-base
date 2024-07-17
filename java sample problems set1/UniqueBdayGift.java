public class UniqueBdayGift {
    public static void main(String[] args) {
        int n=2; // values limit
        int k=1; // size of array

        int MOD=10000;
        int res=0;

        int[][] dp=new int[k+1][n+1];

        for (int i = 1; i <=n ; i++) {
            dp[1][i]=1;
        }


        for (int i = 2; i <=k; i++) {
            for (int j = 1; j <=n ; j++) {
                for (int l = 1; l <=n ; l++) {
                    if (j%l==0){
                        dp[i][j]=(dp[i][j]+dp[i-1 ][l])%MOD;
                    }
                }
            }
        }

        for (int i = 0; i <=k ; i++) {
            for (int j = 0; j <=n; j++) {
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }

        for (int i = 1; i <=n ; i++) {
            res=(res+dp[k][i])%MOD;
        }
        System.out.println(res);

    }
}
