public class printRotation {
    public static void main(String[] args) {
        int[]ar={1,2,3,4,5};
        int rotate=2;
        int size=ar.length;
        int mod=(rotate % size);
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[(i + mod) % size]+" "); // this print left rotated array in
                                                        // O(n) time and O(1) space
        }
    }
}
