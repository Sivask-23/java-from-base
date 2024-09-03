import java.util.ArrayList;

public class ReturnNArraylist {
    static ArrayList<Integer> findIndex(int [] ar, int index, int target, ArrayList<Integer> list){
        if (index==ar.length){
            return list;
        }
        if (ar[index]==target){
            list.add(index);
        }
        return findIndex(ar, index+1, target, list);
    }
    public static void main(String[] args) {
        int[] ar={2,1,4,3,2,5,7,2,6,2,5};
        int target=2;
        ArrayList<Integer> l1=findIndex(ar,0,target,new ArrayList<>());
        System.out.println(l1);
    }
}
