public class FindSortedorNot {
    static boolean sortedOrNot(int [] ar, int i){

        if (i==ar.length-1){
            return true;
        }

        if (ar[i]<ar[i+1]){
            return sortedOrNot(ar,i+1);
        }
        return false;
    }
    public static void main(String[] args) {
        int []ar={1,2,3,4,5,10};
        System.out.println(sortedOrNot(ar,0));
    }
}
