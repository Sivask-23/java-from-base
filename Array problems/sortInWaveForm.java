import java.util.Arrays;

public class sortInWaveForm {
    public static void swapArray(int ar[],int a, int b){
        int temp=ar[a];
        ar[a]=ar[b];
        ar[b]=temp;
    }
    public static void main(String[] args) {
        int[] ar={7,6,2,4,1,8,3,5};
        Arrays.sort(ar);
        for (int i = 0; i < ar.length-1; i+=2) {
            swapArray(ar,i,i+1);
        }
        for (int ele : ar){
            System.out.print(ele +" ");
        }
    }
}
