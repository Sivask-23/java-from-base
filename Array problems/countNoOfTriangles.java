import java.util.Arrays;

public class countNoOfTriangles {
    public static void main(String[] args) {
        int[] ar={4,6,3,7};
        Arrays.sort(ar);   // 3,4,6,7
        int count=0;
        for (int i = 0; i < ar.length; i++) {
            for (int j = i+1; j < ar.length; j++) {
                for (int k = j+1; k < ar.length; k++) {
                    if (ar[i]+ar[j]>ar[k]){
                        count++;
                        System.out.println("{"+ar[i]+","+ar[j]+","+ar[k]+"}");
                    }
                }
            }
        }
        System.out.println(count);
    }
}
