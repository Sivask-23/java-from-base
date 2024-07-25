import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayToList {
    public static void main(String[] args) {
        // converting array to list

        String[] ar={"sk","sooraj","siva","ram"};
        String[] ar1={"hy","my name","is","siva"};
        List<String> l1;
        List<String> l2 = new ArrayList<>();
        l1= Arrays.asList(ar); // method 1
        System.out.println(l1);
        Collections.addAll(l2,ar1); // method 2
        System.out.println(l2);
    }
}
