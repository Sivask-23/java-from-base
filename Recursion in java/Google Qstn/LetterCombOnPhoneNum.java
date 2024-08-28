import java.util.ArrayList;
import java.util.List;

public class LetterCombOnPhoneNum {
    static void phoneComb(String str, String ans){
        if (str.isEmpty()){
            System.out.println(ans);
            return;
        }
        int digit=str.charAt(0)-'0'; // this will convert '2' into 2
        for (int i = ((digit-1)*3); i < (digit*3) ; i++) {
            char ch= (char) ('a'+ i);
            phoneComb(str.substring(1),ans+ch);
        }
    }


//    returning ans as arrayList

    static List<String> phoneCombList(String str, String ans){
        List<String> finalList=new ArrayList<>();
        if (str.isEmpty()){
            List<String > ls=new ArrayList<>();
            ls.add(ans);
            return ls;
        }
        int digit=str.charAt(0)-'0'; // this will convert '2' into 2
        for (int i = ((digit-1)*3); i < (digit*3) ; i++) {
            char ch= (char) ('a'+ i);
            finalList.addAll(phoneCombList(str.substring(1),ans+ch));
        }
        return finalList;
    }
    public static void main(String[] args) {

        phoneComb("12","");
        System.out.println(phoneCombList("12",""));

    }
}
