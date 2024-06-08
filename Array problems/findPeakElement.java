public class findPeakElement {
    public static void main(String[] args) {
        int[]ar={10, 20, 15, 2, 23, 90, 67};
        int l=0;
        int m=1;
        int h=2;
        while (h<=ar.length-1){
            if (ar[l] < ar[m] && ar[m] > ar[h]){
                System.out.println(ar[m]);
            }
            l++;
            m++;
            h++;
        }
    }
}
