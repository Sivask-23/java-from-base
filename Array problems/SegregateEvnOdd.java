public class SegregateEvnOdd {
    public static void main(String[] args) {
        int[] ar={1,2,3,4,5,6};
        int even=-1;
        for (int i = 0; i < ar.length; i++) {
            if (ar[i]%2==0){
                even++;
                int temp=ar[i];
                ar[i]=ar[even];
                ar[even]=temp;
            }

        }
        for (int ele : ar){
            System.out.print(ele+" ");
        }
    }
}
