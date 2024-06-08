import java.util.ArrayList;

public class smallestSubArrayWithSum {
    public static void main(String[] args) {
        int[]ar={1, 4, 45, 6, 0, 19};
        int x=51;
        int countOfElement=ar.length+1;
        ArrayList<Integer> list=new ArrayList<>();
        for (int i = 0; i < ar.length; i++) {
            int cSum=ar[i];
            if (cSum>x){
                list.add(1);
                break;
            }
            for (int j = i+1; j < ar.length; j++) {
                cSum+=ar[j];
                if (cSum>x && (j-i+1)<countOfElement){
                    countOfElement=(j-i+1);
                    list.add(countOfElement);
                }
            }

        }
        System.out.println(list.get(list.size()-1));
    }
}
