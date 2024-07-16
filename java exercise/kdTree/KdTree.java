import edu.princeton.cs.algs4.Point2D;
import edu.princeton.cs.algs4.RectHV;
import edu.princeton.cs.algs4.SET;

public class KdTree {
    private static class Node {
        private Point2D p;
        private RectHV rect;
        private Node lb;
        private Node rt;

        public Node(Point2D p, RectHV rect) {
            this.p = p;
            this.rect = rect;
        }
    }

    private Node root;
    private int size;

    public KdTree() {
        root = null;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public void insert(Point2D p) {
        if (p == null) throw new IllegalArgumentException("argument is null");
        root = insert(root, p, true, new RectHV(0, 0, 1, 1));
    }

    private Node insert(Node node, Point2D p, boolean useX, RectHV rect) {
        if (node == null) {
            size++;
            return new Node(p, rect);
        }
        if (node.p.equals(p)) return node;

        double cmp = useX ? p.x() - node.p.x() : p.y() - node.p.y();
        if (cmp < 0) {
            if (useX) {
                node.lb = insert(node.lb, p, !useX, new RectHV(rect.xmin(), rect.ymin(), node.p.x(), rect.ymax()));
            } else {
                node.lb = insert(node.lb, p, !useX, new RectHV(rect.xmin(), rect.ymin(), rect.xmax(), node.p.y()));
            }
        } else {
            if (useX) {
                node.rt = insert(node.rt, p, !useX, new RectHV(node.p.x(), rect.ymin(), rect.xmax(), rect.ymax()));
            } else {
                node.rt = insert(node.rt, p, !useX, new RectHV(rect.xmin(), node.p.y(), rect.xmax(), rect.ymax()));
            }
        }
        return node;
    }

    public boolean contains(Point2D p) {
        if (p == null) throw new IllegalArgumentException("argument is null");
        return contains(root, p, true);
    }

    private boolean contains(Node node, Point2D p, boolean useX) {
        if (node == null) return false;
        if (node.p.equals(p)) return true;

        double cmp = useX ? p.x() - node.p.x() : p.y() - node.p.y();
        if (cmp < 0) {
            return contains(node.lb, p, !useX);
        } else {
            return contains(node.rt, p, !useX);
        }
    }

    public void draw() {
        draw(root, true);
    }

    private void draw(Node node, boolean useX) {
        if (node == null) return;
        node.p.draw();
        if (useX) {
            // Draw vertical line
            new Point2D(node.p.x(), node.rect.ymin()).drawTo(new Point2D(node.p.x(), node.rect.ymax()));
        } else {
            // Draw horizontal line
            new Point2D(node.rect.xmin(), node.p.y()).drawTo(new Point2D(node.rect.xmax(), node.p.y()));
        }
        draw(node.lb, !useX);
        draw(node.rt, !useX);
    }

    public Iterable<Point2D> range(RectHV rect) {
        if (rect == null) throw new IllegalArgumentException("argument is null");
        SET<Point2D> pointsInRange = new SET<Point2D>();
        range(root, rect, pointsInRange);
        return pointsInRange;
    }

    private void range(Node node, RectHV rect, SET<Point2D> pointsInRange) {
        if (node == null) return;
        if (rect.intersects(node.rect)) {
            if (rect.contains(node.p)) {
                pointsInRange.add(node.p);
            }
            range(node.lb, rect, pointsInRange);
            range(node.rt, rect, pointsInRange);
        }
    }

    public Point2D nearest(Point2D p) {
        if (p == null) throw new IllegalArgumentException("argument is null");
        if (root == null) return null;
        return nearest(root, p, root.p, true);
    }

    private Point2D nearest(Node node, Point2D p, Point2D nearest, boolean useX) {
        if (node == null) return nearest;
        if (node.rect.distanceSquaredTo(p) < nearest.distanceSquaredTo(p)) {
            if (node.p.distanceSquaredTo(p) < nearest.distanceSquaredTo(p)) {
                nearest = node.p;
            }
            Node first, second;
            if ((useX && p.x() < node.p.x()) || (!useX && p.y() < node.p.y())) {
                first = node.lb;
                second = node.rt;
            } else {
                first = node.rt;
                second = node.lb;
            }
            nearest = nearest(first, p, nearest, !useX);
            nearest = nearest(second, p, nearest, !useX);
        }
        return nearest;
    }

    public static void main(String[] args) {
        // unit testing of the methods (optional)
    }
}
