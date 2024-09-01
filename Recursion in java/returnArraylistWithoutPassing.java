import java.util.ArrayList;

public class returnArraylistWithoutPassing {
    static ArrayList<Integer> findIndex(int[]ar, int target, int index){
        ArrayList<Integer>l1=new ArrayList<>();
        if (index==ar.length){
            return l1;
        }
        if (ar[index]==target){
            l1.add(index);
        }
        ArrayList<Integer> ans = findIndex(ar,target,index+1);
        l1.addAll(ans);
        return l1;
    }
    public static void main(String[] args) {
        int [] ar={1,2,3,2,4,2,5};
        int target=2;
        ArrayList<Integer> list=findIndex(ar,target,0);
        System.out.println(list);
    }
}
