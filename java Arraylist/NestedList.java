import java.util.ArrayList;
import java.util.List;

public class NestedList {
    public static void main(String[] args) {
        List<List<Integer>> listOfList=new ArrayList<>();
//        first list
        List<Integer>l1=new ArrayList<>();
        l1.add(4);
        l1.add(3);
        l1.add(2);
//        second list
        List<Integer>l2=new ArrayList<>();
        l2.add(5);
        l2.add(3);
        l2.add(1);
//        third list
        List<Integer>l3=new ArrayList<>();
        l3.add(4);
        l3.add(3);
        l3.add(2);

        listOfList.add(l1);
        listOfList.add(l2);
        listOfList.add(l3);
        System.out.println(listOfList);

        for (int i = 0; i < listOfList.size(); i++) {
            List<Integer> innerlist=listOfList.get(i);
            System.out.println(innerlist);
        }
        System.out.println();
        System.out.println("access method 2");
        for (int i = 0; i < listOfList.size(); i++) {
            System.out.println(listOfList.get(i));
        }
        System.out.println();
        System.out.println("access method 3 using enhanced for loop");
        for (List<Integer> inner : listOfList){
            for (int ele: inner){
                System.out.println(ele);
            }
        }
        System.out.println();
        System.out.println("access method 4 using normal for loop with indices");
        for (int i = 0; i < listOfList.size(); i++) {
            List<Integer> inner=listOfList.get(i);
            for (int j = 0; j < inner.size(); j++) {
                System.out.println(inner.get(j));
            }
        }

    }
}
