import java.util.ArrayList;

public class tripletSuminArray {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        int[] ar={12, 3, 4, 1, 6, 9};
        int sum=24;
        for (int i = 0; i < ar.length; i++) {
            int l=i+1;
            int h=ar.length-1;
            while (l<h){
                if (ar[i]+ar[l]+ar[h]==sum){
                    list.add(ar[i]);
                    list.add(ar[l]);
                    list.add(ar[h]);
                    break;
                }
                else if (ar[i]+ar[l]+ar[h]<sum){
                    l++;
                }else {
                    h--;
                }
            }
        }

        for (int i = 2; i >=0; i--) {
            System.out.print(list.get(i)+" ");
        }
    }
}
