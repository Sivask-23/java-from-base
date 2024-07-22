public class insertionSort {
    public static void main(String[] args) {
        int[] ar={77,5,4,10,1,6,2};
        for (int i = 1; i < ar.length; i++) {
            int temp=ar[i];
            int j=i-1;
            while (j>=0 && ar[j]>temp){
                ar[j+1]=ar[j];
                j--;
            }
            ar[j+1]=temp;

        }
        for (int i : ar) {
            System.out.print(i + " ");
        }

    }
}
