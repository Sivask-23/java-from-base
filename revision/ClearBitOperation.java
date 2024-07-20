public class ClearBitOperation {
    public static void main(String[] args) {
        int num = 5; // 0101
        int pos = 2;
        int bitMask = 1 << pos;
        int notBitmask = ~(bitMask);
        int ans=(notBitmask & num);
        System.out.println(ans); // 0101 after clearing bit at 3rd position becomes => 0001 which is 1
    }
}
