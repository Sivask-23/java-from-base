public class AllPathMaze {
    static void allDirection(String ans, boolean[][] maze, int r, int c) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            System.out.println(ans);
            return;
        }
        if (!maze[r][c]){
            return;
        }

        maze[r][c]=false;
        if (r > 0) {
            allDirection(ans + 'U', maze, r - 1, c);
        }
        if (c > 0) {
            allDirection(ans + 'L', maze, r, c - 1);
        }
        if (r < maze.length - 1) {
            allDirection(ans + 'D', maze, r + 1, c);
        }
        if (c < maze[0].length - 1) {
            allDirection(ans + 'R', maze, r, c + 1);
        }
        maze[r][c]=true;
    }

    public static void main(String[] args) {

        boolean[][] maze={
                {true,true,true},
                {true,true,true},
                {true,true,true},
        };
        allDirection("",maze,0,0);

    }
}
