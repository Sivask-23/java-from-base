import java.util.ArrayList;
import java.util.List;

public class PrintingPathsFromSourceToDestination {
    static void printAllPaths(String ans, int r, int c){
        if (r==1 && c==1) {
            System.out.println(ans);
            return;
        }
        if (r>1) {
            printAllPaths(ans + 'D', r - 1, c);
        }
        if (c>1){
            printAllPaths(ans + 'R', r, c - 1);
        }
    }

//     print in arrayList
  static List<String> printPaths(String ans, int r, int c){
    if (r==1 && c==1) {
        List<String> anslist =new ArrayList<>();
        anslist.add(ans);
        return anslist;
    }
    List<String> finalAnswerList=new ArrayList<>();
    if (r>1) {
        finalAnswerList.addAll(printPaths(ans + 'D', r - 1, c));
    }
    if (c>1){
        finalAnswerList.addAll(printPaths(ans + 'R', r, c-1));
    }
    return finalAnswerList;
}


    public static void main(String[] args) {
        printAllPaths("",3,3);
        System.out.println(printPaths("",3,3));

    }
}
