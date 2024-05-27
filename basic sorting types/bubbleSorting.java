public class bubbleSorting {
    public static void main(String[] args) {
        int [] ar={1,5,10,12,4,6,3,2,8,12,1};
        for (int i = 0; i < ar.length-1; i++) {
            for (int j = 0; j < ar.length-i-1; j++) {
                if (ar[j] > ar[j+1]){
//                    swap
                    int temp=ar[j];
                    ar[j]=ar[j+1];
                    ar[j+1]=temp;
                }
            }
          }
        for (int j:ar){
            System.out.print(j+" ");
        }
        // here time complexity = O(n^2)
    }
}
