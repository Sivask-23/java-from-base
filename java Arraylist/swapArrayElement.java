import java.util.Arrays;

public class swapArrayElement {
    static void swapAr(int[] arr, int a, int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    public static void main(String[] args) {
        int [] ar= {1,2,3,4,5};
        swapAr(ar,1,3);
        System.out.println(Arrays.toString(ar));
    }
}
