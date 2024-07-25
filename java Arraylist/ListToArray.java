import java.util.ArrayList;
import java.util.List;

public class ListToArray {
    public static void main(String[] args) {
        List<String> l1=new ArrayList<>();
        l1.add("siva");
        l1.add("kumar");
        l1.add("s");
        l1.add("nemom");
        String [] ar=new String[l1.size()];
        l1.toArray(ar);
        for (String s: ar){
            System.out.print(s+" ");
        }

    }
}
