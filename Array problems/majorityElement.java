public class majorityElement {
    public static void main(String[] args) {
        int[] ar={ 1, 1, 2, 1, 3, 5, 1};
        int n=ar.length;
        int countofElement=0;
        for (int i = 0; i < ar.length; i++) {
            countofElement=0;
            for (int j = 0; j < ar.length; j++) {
                if (ar[i]==ar[j]){
                    countofElement++;
                }
            }
            if (countofElement>(n/2)){
                System.out.println(ar[i]);
                break;
            }
        }
        if (countofElement<=(n/2)){
            System.out.println("Nothing exist");
        }
    }
}
