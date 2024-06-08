public class minimumIncrementByK {
    public static int countOfK(int ar[], int k){
        int count=0;
        int max=0;
        for (int i = 0; i < ar.length; i++) {
            if (ar[i]>max){
                max=ar[i];
            }
        }
        for (int i = 0; i < ar.length; i++) {
            if ((max - ar[i])%k!=0){
                return -1;
            } else if ((max - ar[i])%k==0) {
                int ele=((max-ar[i])/k);
                count=count+ele;
            }else {
                return 0;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] ar={4, 7, 19, 16};
        int k=3;
        System.out.println(countOfK(ar,k));

    }
}
