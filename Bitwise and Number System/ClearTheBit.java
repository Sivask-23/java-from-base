public class ClearTheBit {
    public static void main(String[] args) {
        int num = 5;// 0101 clear the bit from 0th position 0101 => 0100 ie, 5 => 4
        int pos = 0;

        int bitMask = 1 << pos;
        int notBitmask = ~(bitMask);
        int ans = num & notBitmask;
        System.out.println(ans);
    }
}
