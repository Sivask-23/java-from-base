public class selctnSort {
    public static void main(String[] args) {
        int [] ar={77,6,5,4,3,2,1,0,9};
        for (int i = 0; i < ar.length; i++) {

            int min=i;
            for (int j = i+1; j < ar.length; j++) {
                if (ar[min]>ar[j]){
                    min=j;
                }
            }
            int temp=ar[i];
            ar[i]=ar[min];
            ar[min]=temp;
        }
        for (int i : ar) {
            System.out.print(i + " ");
        }
    }
}
