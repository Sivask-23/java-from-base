
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class RandomWord {
    public static void main(String[] args) {
        String champion = null;
        int i = 1;
        while (!StdIn.isEmpty()) {
            String cw = StdIn.readString();
            if (Math.random() < 1.0 / i) {
                champion = cw;
            }
            i++;
        }

        if (champion != null) {
            StdOut.println(champion);
        }
    }
}
