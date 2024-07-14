import java.util.ArrayList;
import java.util.Arrays;

public class BruteCollinearPoints {
    private final ArrayList<LineSegment> segmentList = new ArrayList<>();

    public BruteCollinearPoints(Point[] points) {
        if (points == null) {
            throw new IllegalArgumentException("null");
        }
        for (Point p : points) {
            if (p == null) {
                throw new IllegalArgumentException("Point null");
            }
        }
        checkForDup(points);
        int n = points.length;
        Point[] sortedPoints = points.clone();
        Arrays.sort(sortedPoints);

        for (int i = 0; i < n - 3; i++) {
            for (int j = i + 1; j < n - 2; j++) {
                for (int k = j + 1; k < n - 1; k++) {
                    for (int l = k + 1; l < n; l++) {
                        if (sortedPoints[i].slopeTo(sortedPoints[j]) == sortedPoints[i].slopeTo(sortedPoints[k]) &&
                                sortedPoints[i].slopeTo(sortedPoints[j]) == sortedPoints[i].slopeTo(sortedPoints[l])) {
                            segmentList.add(new LineSegment(sortedPoints[i], sortedPoints[l]));
                        }
                    }
                }
            }
        }
    }

    private void checkForDup(Point[] points) {
        for (int i = 0; i < points.length; i++) {
            for (int j = i + 1; j < points.length; j++) {
                if (points[i].compareTo(points[j]) == 0) {
                    throw new IllegalArgumentException("Duplicate points detected");
                }
            }
        }
    }

    public int numberOfSegments() {
        return segmentList.size();
    }

    public LineSegment[] segments() {
        return segmentList.toArray(new LineSegment[0]);
    }

}
