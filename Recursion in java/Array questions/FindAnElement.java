public class FindAnElement {
    static boolean existOrNot(int []ar, int index, int target){
        if (index==ar.length){
            return false;
        }
        if (ar[index]==target){
            return true;
        }
        return existOrNot(ar,index+1,target);
    }
    public static void main(String[] args) {
        int [] ar ={3,2,1,18,9};
        int target=6;
        System.out.println(existOrNot(ar,0,target));
    }
}
