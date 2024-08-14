import java.util.ArrayList;
import java.util.List;

public class IncludingDiagonalPathsInMaze {
    static List<String>  printPaths(String ans, int r, int c){
        if (r==1 && c==1){
            List<String> temp=new ArrayList<>();
            temp.add(ans);
            return temp;
        }
        List<String> ansList=new ArrayList<>();
        if (r>1){
            ansList.addAll(printPaths(ans+'V',r-1,c));
        }
        if (r>1 && c>1){
            ansList.addAll(printPaths(ans+'D',r-1,c-1));
        }
        if (c>1){
            ansList.addAll(printPaths(ans+'H',r,c-1));
        }
        return ansList;
    }
    public static void main(String[] args) {
        System.out.println(printPaths("",3,3));
    }
}
