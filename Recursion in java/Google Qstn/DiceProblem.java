import java.util.ArrayList;
import java.util.List;

public class DiceProblem {
    static void rollDice(String ans, int target){
        if (target==0){
            System.out.println(ans);
            return;
        }
        for (int i = 1; i <=6 && i<=target ; i++) {
            rollDice(ans+i,target-i);
        }
    }

//    returning list of answers
    static List<String> rollDiceList(String ans, int target){
        if (target==0){
            List<String>l1=new ArrayList<>();
            l1.add(ans);
            return l1;
        }
        List<String> ansList=new ArrayList<>();
        for (int i = 1; i <=6 && i<=target ; i++) {
            ansList.addAll(rollDiceList(ans+i,target-i));
        }
        return ansList;
    }
    public static void main(String[] args) {
        rollDice("",4);
        System.out.println(rollDiceList("",4));
    }
}
