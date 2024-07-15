import java.util.ArrayList;
import java.util.Arrays;

public class Board {

    private final int[][] tiles;
    private final int n;

    public Board(int[][] tiles) {
        n = tiles.length;
        this.tiles = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                this.tiles[i][j] = tiles[i][j];
            }
        }
    }

    public int dimension() {
        return n;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(n).append("\n");
        for (int[] row : tiles) {
            for (int i : row) {
                sb.append(String.format("%2d ", i)); //Each tile value is formatted and appended to sb with a width of 2 characters, followed by a space.
            }
            sb.append("\n");  //After each row is processed, a newline character is appended to move to the next line.
        }
        return sb.toString();
    }


    public int hamming() {

        int hammingdistance = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (tiles[i][j] != 0 && tiles[i][j] != (i * n + j + 1)) {
                    hammingdistance++;
                }
            }
        }
        return hammingdistance;
    }

    public boolean isGoal() {
        return hamming() == 0; // then it's a goal state, ie, no of tiles out of position is zero
    }

    public int manhattan() {
        int manhattandistance = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int val = tiles[i][j];
                if (val != 0) {
                    int targetrow = (val - 1) / n;
                    int targetcol = (val - 1) % n;
                    manhattandistance += Math.abs((i - targetrow)) + Math.abs((j - targetcol));
                }
            }
        }
        return manhattandistance;
    }

    public boolean equals(Object y) {
        if (this == y) {
            return true;
        }
        if (y == null || getClass() != y.getClass()) {
            return false;
        }
        Board b = (Board) y; // casting
        return Arrays.deepEquals(tiles, b.tiles);
    }

    private int[] findblank() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (tiles[i][j] == 0) {
                    return new int[]{i, j};
                }
            }
        }
        throw new IllegalStateException("Blank space not found");
    }

    public Iterable<Board> neighbors() {
        ArrayList<Board> neighbors = new ArrayList<>();
        int[] blankpos = findblank();
        int blankx = blankpos[0];
        int blanky = blankpos[1];

        if (blankx > 0) {
            neighbors.add(new Board(swap(blankx, blanky, blankx - 1, blanky)));// blanktile up
        }
        if (blankx < n - 1) {
            neighbors.add(new Board(swap(blankx, blanky, blankx + 1, blanky))); // blanktile down
        }
        if (blanky > 0) {
            neighbors.add(new Board(swap(blankx, blanky, blankx, blanky - 1))); // blanktile left
        }
        if (blanky < n - 1) {
            neighbors.add(new Board(swap(blankx, blanky, blankx, blanky + 1))); // blanktile right
        }
        return neighbors;

    }

    private int[][] swap(int x1, int y1, int x2, int y2) {
        int[][] newTiles = copytiles();
        int temp = newTiles[x1][y1];
        newTiles[x1][y1] = newTiles[x2][y2];
        newTiles[x2][y2] = temp;
        return newTiles;
    }

    private int[][] copytiles() {
        int[][] copy = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                copy[i][j] = tiles[i][j];
            }
        }
        return copy;
    }


    public Board twin() {
        int[][] twintile = copytiles();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (twintile[i][j] != 0 && twintile[i][j + 1] != 0) {
                    int temp = twintile[i][j];
                    twintile[i][j] = twintile[i][j + 1];
                    twintile[i][j + 1] = temp;
                    return new Board(twintile);
                }
            }
        }
        return null;
    }


    public static void main(String[] args) {

        int[][] tiles = {
                {8, 1, 3},
                {4, 0, 5},
                {7, 2, 6}
        };

        Board b1 = new Board(tiles);
        System.out.println("initial tile state");
//        System.out.println(b1.toString());
        System.out.println(b1.hamming());
        System.out.println(b1.isGoal());
        System.out.println(b1.manhattan());
        System.out.println("neighbours are ");
        for (Board i : b1.neighbors()) {
            System.out.println(i);
        }

        System.out.println(b1.twin());


    }
}
