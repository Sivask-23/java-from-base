import edu.princeton.cs.algs4.WeightedQuickUnionUF;

public class Percolation {
    private boolean[][] grid;
    private int nopen;
    private final int n;
    private final WeightedQuickUnionUF wquf;

    private final WeightedQuickUnionUF wqufull;
    private final int top;
    private final int bot;

    public Percolation(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("N should be greater than 0");
        }
        this.n = n;
        this.grid = new boolean[n][n];
        this.nopen = 0;
        this.wquf = new WeightedQuickUnionUF(n * n + 2);
        this.wqufull = new WeightedQuickUnionUF(n * n + 1);
        this.top = n * n;
        this.bot = n * n + 1;

    }

    private void validate(int r, int c) {
        if (r < 1 || r > n || c < 1 || c > n) {
            throw new IllegalArgumentException("row and column should be within range of bound");
        }
    }

    public boolean percolates() {
        return (wquf.find(top) == wquf.find(bot));
    }

    public int numberOfOpenSites() {
        return nopen;
    }

    public boolean isOpen(int r, int c) {
        validate(r, c);
        return grid[r - 1][c - 1];
    }

    private int getIndex(int r, int c) {
        return (r - 1) * n + (c - 1);
    }

    //    now we need to connect adjacent sites of current site
    private void connectAdj(int r, int c) {

        int index = getIndex(r, c);
        if (r > 1 && isOpen(r - 1, c)) {
            wquf.union(index, getIndex(r - 1, c));
            wqufull.union(index, getIndex(r - 1, c));
        }
        if (r < n && isOpen(r + 1, c)) {
            wquf.union(index, getIndex(r + 1, c));
            wqufull.union(index, getIndex(r + 1, c));
        }
        if (c > 1 && isOpen(r, c - 1)) {
            wquf.union(index, getIndex(r, c - 1));
            wqufull.union(index, getIndex(r, c - 1));
        }
        if (c < n && isOpen(r, c + 1)) {
            wquf.union(index, getIndex(r, c + 1));
            wqufull.union(index, getIndex(r, c + 1));
        }

    }

    public void open(int r, int c) {
        validate(r, c);
        if (!isOpen(r, c)) {
            grid[r - 1][c - 1] = true;
            nopen++;
            int index = getIndex(r, c);
            if (r == 1) {
                wquf.union(index, top);
                wqufull.union(index, top);
            }
            if (r == n) {
                wquf.union(index, bot);
            }
            connectAdj(r, c);
        }
    }

    public boolean isFull(int r, int c) {
        validate(r, c);
        return (wqufull.find(getIndex(r, c)) == wqufull.find(top));
    }

    public static void main(String[] args) {
        Percolation p = new Percolation(5);
        p.open(1, 1);
        p.open(2, 1);
        p.open(3, 1);
        p.open(4, 1);
        p.open(5, 1);
        System.out.println(p.percolates());
    }
}
