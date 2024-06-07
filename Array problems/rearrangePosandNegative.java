import java.util.Arrays;

public class rearrangePosandNegative {
    public static void swapAr(int[] ar, int i , int j){
        int temp=ar[i];
        ar[i]=ar[j];
        ar[j]=temp;
    }
    public static void main(String[] args) {
        int[] ar={-1, 3, -2, -4, 7, -5};
        int neg=0;
        for (int i = 0; i < ar.length; i++) {
            if (ar[i]<0){
                swapAr(ar,neg,i);
                neg++;
            }
        }
        int pos=neg;
        neg=0;
        while (neg<pos && pos<ar.length && ar[neg]<0){
            swapAr(ar,neg,pos);
            neg+=2;
            pos++;
        }

        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i]+" ");
        }
    }
}
