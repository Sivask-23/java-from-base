import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.StdStats;

public class PercolationStats {
    private final double[] thr;
    private final int tr;

    public PercolationStats(int n, int trls) {
        if (n <= 0 || trls <= 0) {
            throw new IllegalArgumentException("should be greater than 0");
        }
        this.tr = trls;
        this.thr = new double[tr];
        for (int i = 0; i < trls; i++) {
            Percolation p = new Percolation(n);
            while (!p.percolates()) {
                int r = StdRandom.uniformInt(1, n + 1);
                int c = StdRandom.uniformInt(1, n + 1);
                if (!p.isOpen(r, c)) {
                    p.open(r, c);
                }
            }
            thr[i] = (double) p.numberOfOpenSites() / (n * n);
        }
    }

    public double mean() {
        return StdStats.mean(thr);
    }

    public double stddev() {
        return StdStats.stddev(thr);
    }

    public double confidenceLo() {
        return mean() - (1.96 * stddev() / Math.sqrt(tr));
    }

    public double confidenceHi() {
        return mean() + (1.96 * stddev() / Math.sqrt(tr));
    }

    public static void main(String[] args) {

        int n = Integer.parseInt(args[0]);
        int trls = Integer.parseInt(args[1]);

        PercolationStats ps = new PercolationStats(n, trls);
        System.out.println("mean                    = " + ps.mean());
        System.out.println("stddev                  = " + ps.stddev());
        System.out.println("95% confidence interval = [" + ps.confidenceLo() + ", " + ps.confidenceHi() + "]");

    }
}
