public class findMissingSmallestelement {
    public static void main(String[] args) {
        int[] ar={0, 1, 2, 3, 4, 5, 6, 7, 10};
        int n=ar.length;
        int m=11;
        int count=0;
        for (int i = 0,j=0; i < m && j < ar.length; i++,j++) {
            if (ar[j]==i){
                count++;
            }
        }
        System.out.println(count);
    }
}
