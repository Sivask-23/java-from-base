import java.util.Arrays;

public class removeDuplicates {
    public static void main(String[] args) {
        int[]ar={12,10,9,45,2,10,10,45};
        Arrays.sort(ar);
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i]+" ");
        }
        System.out.println();
        for (int i = 0; i < ar.length; i++) {

            while (i<ar.length-1 && ar[i]==ar[i+1]){
                i++;
            }
            System.out.print(ar[i]+" ");

        }
    }
}
