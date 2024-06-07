import java.util.Arrays;

public class reOrderElementsBasedOnIndex {
    public static void swap(int[] ar, int i, int j){
        int temp=ar[i];
        ar[i]=ar[j];
        ar[j]=temp;
    }
    public static void main(String[] args) {
        int [] ar={50, 40, 70, 60, 90};
        int[] index={3,  0,  4,  1,  2};
        int []res=new int[ar.length];
        for (int i = 0; i < index.length; i++) {
            int val=index[i];
            res[val]=ar[i];
        }


        for (int i = 0; i < ar.length; i++) {
            System.out.print(res[i]+" ");
        }
    }
}
