import java.util.Arrays;

public class inversionCount {
    public static void main(String[] args) {
        int[] ar={8,4,8,1};
        int count=0;
        for (int i = 0; i < ar.length; i++) {
            for (int j = i+1; j < ar.length; j++) {
                if (ar[i]>ar[j]){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
