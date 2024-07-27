import java.util.ArrayList;
import java.util.Scanner;

public class ListofList {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
//        initialisation => [[],[],[]]
        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());
        }

//        inserting values
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < 4; j++) {
                list.get(i).add(sc.nextInt());
            }
        }

        System.out.println(list);

    }
}
