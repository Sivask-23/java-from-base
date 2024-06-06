public class leadersInArray {
    public static void main(String[] args) {
        int[] ar={16,17,4,3,5,2};
        for (int i = 0; i < ar.length; i++) {
            boolean large=true;
            for (int j = i+1; j < ar.length; j++) {
                if (ar[i]<ar[j]){
                    large=false;
                    break;
                }
            }
            if (large){
                System.out.print(ar[i]+" ");
            }
        }
    }
}
