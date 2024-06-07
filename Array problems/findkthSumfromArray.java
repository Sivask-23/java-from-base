import java.util.ArrayList;
import java.util.Collections;

public class findkthSumfromArray {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        int [] ar={20,-5,-1};
        int k=6;
        int sum=0;
        for (int i = 0; i < ar.length; i++) {
            sum=0;
            for (int j = i; j < ar.length; j++) {
                sum+=ar[j];
                list.add(sum);
            }
        }
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);
        System.out.println(list.get(k-1));
    }
}
