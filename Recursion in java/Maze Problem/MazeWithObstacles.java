public class MazeWithObstacles {
    static void pathWithRestriction(String ans, boolean[][] maze, int r, int c){

        if (r== maze.length-1 && c==maze[0].length-1){
            System.out.println(ans);
            return;
        }
        if (!maze[r][c]){
            return;
        }
        if (r< maze.length-1){
            pathWithRestriction(ans+'D',maze,r+1,c);
        }
        if (c<maze[0].length-1){
            pathWithRestriction(ans+'R',maze,r,c+1);
        }
    }
    public static void main(String[] args) {
        boolean[][] maze={
                {true,true,true},
                {true,false,true},
                {true,true,true},
        };
        System.out.println(maze[0].length);
        System.out.println();
        pathWithRestriction("",maze,0,0);
    }
}
