public class SetBitoperation {
    public static void main(String[] args) {
        int num=5; //0101
        int pos=1; // that is second bit
        int Bitmask= 1 << pos;
        int ans=(Bitmask | num);
        System.out.println(ans); // answer is 7 => 0111 second bit set to 1
    }
}
