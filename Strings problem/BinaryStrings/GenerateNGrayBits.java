import java.util.ArrayList;
import java.util.List;

public class GenerateNGrayBits {
    public static void generateGray(int n,StringBuilder result, List<String> ls){

        if (result.length()==n) {
            ls.add(result.toString());
            return;
        } else {
            result.append('0');
            generateGray(n, result, ls);
            result.deleteCharAt(result.length() - 1);
            result.append('1');
            generateGray(n,result, ls);
            result.deleteCharAt(result.length() - 1);
        }

    }
    public static void main(String[] args) {

        int n=2;
        StringBuilder result=new StringBuilder();
        List<String> ls=new ArrayList<>();
        generateGray(n,result,ls);
        for (int i = 0; i < ls.size(); i++) {
            System.out.println(ls.get(i));
        }

    }
}
