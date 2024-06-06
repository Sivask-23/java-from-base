import java.util.Arrays;

public class singleElement {
    public static void main(String[] args) {
        int[] ar={2,3,5,4,5,3,4,1,6};
        for (int i = 0; i < ar.length; i++) {
            int count=0;
            for (int j = 0; j < ar.length; j++) {
                if (ar[i]==ar[j]){
                    count++;
                }
            }
            if (count==1){
                System.out.println(ar[i]);
            }
        }
    }
}
