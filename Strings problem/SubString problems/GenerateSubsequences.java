import java.util.ArrayList;
import java.util.List;

public class GenerateSubsequences {
    static List<String > ls=new ArrayList<>();
    public static void findSubSeq(String str, String ans, int index){
        if (index==str.length()){
            ls.add(ans);
            return;
        }
        findSubSeq(str,ans + str.charAt(index),index+1);

        findSubSeq(str,ans,index+1);

    }
    public static void main(String[] args) {
        String str="abc";
        findSubSeq(str,"",0);
        System.out.println(ls);
    }
}
