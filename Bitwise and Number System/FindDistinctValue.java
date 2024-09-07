public class FindDistinctValue {
    public static void main(String[] args) {

        int [] ar={1,2,3,-1,-2,-4,4,-3,-7};
        int [] ar1={1,2,3,2,1,4,5,5,4,3,7,8,8};
        int sum=0;
        for (int i = 0; i < ar.length; i++) {
            sum+=ar[i];
        }
        System.out.println("distinct value in array is "+sum);
        int ans=0;
        for (int i = 0; i < ar1.length; i++){
            ans=ans^ar1[i];
        }
        System.out.println("distinct value in array1 is "+ans);
    }
}
