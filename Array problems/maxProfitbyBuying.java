public class maxProfitbyBuying {
    public static void maxDifference(int[]ar,int n){

        int maxDif=ar[1]-ar[0];
        int i=0;
        int j=0;
        for (i = 0; i < n; i++) {
            for (j = i+1; j < n; j++) {
                int dif=ar[j]-ar[i];
                if (dif>maxDif){
                    maxDif=dif;
                }
            }
        }
        System.out.println("max profit = "+maxDif);

    }
    public static void main(String[] args) {
        int [] price={2, 30, 15, 10, 8, 25, 80};
        int n=price.length;
        int [] profit=new int[n];
        int [] profit1=new int[n];
//        maxDifference(price,n);
        int maxPrice = price[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            if (price[i] > maxPrice) {
                maxPrice = price[i];
            }
            // Update the profit[i] to the maximum profit we can make from i to n-1
            profit[i] = Math.max(profit[i + 1], maxPrice - price[i]);
        }

        int minPrice=price[0];
        for (int i = 1; i < n; i++) {

            if (price[i]<minPrice){
                minPrice=price[i];
            }
            profit1[i]=Math.max(profit[i-1],profit[i]+(price[i]-minPrice));

        }


        for (int i = 0; i < n; i++) {
            System.out.print(profit[i]+" ");
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.print(profit1[i]+" ");
        }

    }
}
