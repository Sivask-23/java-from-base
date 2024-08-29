import java.util.Arrays;

public class PrintAllPathsInAMatrix {

    static void printInMatrix(String ans, boolean[][] maze, int r, int c, int[][] path, int steps){
        if (r==maze.length-1 && c==maze[0].length-1){
            path[r][c]=steps;
            for (int[] ar:path){
                System.out.println(Arrays.toString(ar));
            }
            System.out.println(ans);
            System.out.println();
            return;
        }
        if (!maze[r][c]){
            return;
        }
        maze[r][c]=false;
        path[r][c]=steps;
        if (r>0){
            printInMatrix(ans+'U',maze,r-1,c,path,steps+1);
        }
        if (c>0){
            printInMatrix(ans+'L', maze, r, c-1, path, steps+1);
        }
        if (r< maze.length-1){
            printInMatrix(ans+'D', maze, r+1, c, path, steps+1);
        }
        if (c<maze[0].length-1){
            printInMatrix(ans+'R', maze, r, c+1, path, steps+1);
        }
        maze[r][c]=true;
        path[r][c]=0;
    }
    public static void main(String[] args) {

        boolean[][] maze={
                {true,true,true},
                {true,true,true},
                {true,true,true}
        };
        int[][]path=new int[maze.length][maze[0].length];
        printInMatrix("",maze,0,0,path,1);

    }
}
