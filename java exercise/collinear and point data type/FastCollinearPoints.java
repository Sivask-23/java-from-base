import java.util.ArrayList;
import java.util.Arrays;

public class FastCollinearPoints {
    private final ArrayList<LineSegment> segmentsList = new ArrayList<>();

    public FastCollinearPoints(Point[] points) {
        if (points == null) throw new IllegalArgumentException("Argument is null");
        for (Point p : points) {
            if (p == null) throw new IllegalArgumentException("Null point");
        }
        checkForDuplicates(points);

        Point[] sortedPoints = points.clone();
        Arrays.sort(sortedPoints);
        int n = sortedPoints.length;

        for (int i = 0; i < n; i++) {
            Point origin = sortedPoints[i];
            Point[] sortedBySlope = sortedPoints.clone();
            Arrays.sort(sortedBySlope, origin.slopeOrder());

            int j = 1;
            while (j < n) {
                ArrayList<Point> collinear = new ArrayList<>();
                final double SLOPE_REF = origin.slopeTo(sortedBySlope[j]);
                do {
                    collinear.add(sortedBySlope[j++]);
                } while (j < n && Double.compare(SLOPE_REF, origin.slopeTo(sortedBySlope[j])) == 0);

                if (collinear.size() >= 3) {
                    collinear.add(origin);
                    Point[] collinearPoints = collinear.toArray(new Point[0]);
                    Arrays.sort(collinearPoints);
                    if (origin.compareTo(collinearPoints[0]) == 0) {
                        segmentsList.add(new LineSegment(collinearPoints[0], collinearPoints[collinearPoints.length - 1]));
                    }
                }
            }
        }
    }

    private void checkForDuplicates(Point[] points) {
        for (int i = 0; i < points.length; i++) {
            for (int j = i + 1; j < points.length; j++) {
                if (points[i].compareTo(points[j]) == 0) {
                    throw new IllegalArgumentException("Duplicate points detected");
                }
            }
        }
    }

    public int numberOfSegments() {
        return segmentsList.size();
    }

    public LineSegment[] segments() {
        return segmentsList.toArray(new LineSegment[0]);
    }
}
