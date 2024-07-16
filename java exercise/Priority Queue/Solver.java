import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.MinPQ;
import edu.princeton.cs.algs4.StdOut;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Solver {
    private final boolean solvable;
    private final int moves;
    private final List<Board> solution;

    private static class SearchNode {
        private final Board board;
        private final int moves;
        private final SearchNode previous;

        public SearchNode(Board board, int moves, SearchNode previous) {
            this.board = board;
            this.moves = moves;
            this.previous = previous;
        }
    }

    public Solver(Board initial) {
        if (initial == null) {
            throw new IllegalArgumentException("should not be null");
        }
        MinPQ<SearchNode> pq = new MinPQ<>(Comparator.comparingInt(this::priority));
        pq.insert(new SearchNode(initial, 0, null));

        MinPQ<SearchNode> twinPQ = new MinPQ<>(Comparator.comparingInt(this::priority));
        twinPQ.insert(new SearchNode(initial.twin(), 0, null));
        SearchNode goalNode = null;
        while (true) {
            goalNode = step(pq);
            if (goalNode != null || step(twinPQ) != null) break;
        }
        if (goalNode != null) {
            solvable = true;
            moves = goalNode.moves;
            solution = new ArrayList<>();
            for (SearchNode node = goalNode; node != null; node = node.previous) {
                solution.add(0, node.board);
            }
        } else {
            solvable = false;
            moves = -1;
            solution = null;
        }
    }

    private SearchNode step(MinPQ<SearchNode> pq) {
        if (pq.isEmpty()) return null;
        SearchNode node = pq.delMin();
        if (node.board.isGoal()) return node;
        for (Board neighbor : node.board.neighbors()) {
            if (node.previous == null || !neighbor.equals(node.previous.board)) {
                pq.insert(new SearchNode(neighbor, node.moves + 1, node));
            }
        }
        return null;
    }

    private int priority(SearchNode node) {
        return node.moves + node.board.manhattan();
    }

    public boolean isSolvable() {
        return solvable;
    }

    public int moves() {
        return moves;
    }

    public Iterable<Board> solution() {
        return solution;
    }

    public static void main(String[] args) {

        int[][] tiles ={
                {1,0,3},
                {2,7,8},
                {4,6,5}
        };
        Board initial = new Board(tiles);

        Solver solver = new Solver(initial);

        if (!solver.isSolvable())
            StdOut.println("No solution possible");
        else {
            StdOut.println("Minimum number of moves = " + solver.moves());
            for (Board board : solver.solution())
                StdOut.println(board);
        }

    }
}
