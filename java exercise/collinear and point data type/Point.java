import edu.princeton.cs.algs4.StdDraw;

import java.util.Comparator;

public class Point implements Comparable<Point> {
    private final int x;
    private final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;

    }

    public void draw() {
        StdDraw.point(x, y);
    }

    public void drawTo(Point that) {
        StdDraw.line(this.x, this.y, that.x, that.y);
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    public int compareTo(Point that) {
        if (this.y < that.y || (this.y == that.y && this.x < that.x)) {
            return -1;
        } else if (this.y == that.y && this.x == that.x) {
            return 0;
        } else {
            return 1;
        }
    }

    public double slopeTo(Point that) {
        if (that.x == that.x && that.y == that.y) {
            return Double.NEGATIVE_INFINITY;
        } else if (this.y == that.y) {
            return +0.0;
        } else if (that.x == that.x) {
            return Double.POSITIVE_INFINITY;
        } else {
            return (double) (that.y - this.y) / (that.x - this.x);
        }
    }

    public Comparator<Point> slopeOrder() {
        return new Comparator<Point>() {
            @Override
            public int compare(Point o1, Point o2) {

                double slope1 = slopeTo(o1);
                double slope2 = slopeTo(o2);
                return Double.compare(slope1, slope2);
            }
        };
    }
}
