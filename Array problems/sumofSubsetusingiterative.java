import java.util.ArrayList;

public class sumofSubsetusingiterative {
    public static void subSetsum(int[] ar, int n){
        ArrayList<Integer> list=new ArrayList<>();
        list.add(0);
        for (int i = 0; i < n; i++) {
            int size=list.size();
            for (int j = 0; j < size; j++) {
                list.add(list.get(j)+ar[i]);
            }
        }

        System.out.println(list);
    }
    public static void main(String[] args) {
        int[] ar={2,3};
        int n=ar.length;
        subSetsum(ar,n);

    }
}
