public class GetBitfromPosition {
    public static void main(String[] args) {

        int num = 5; // 0101
        int position = 2; // which is third position
//        doing bitmask
        int BitMask = 1 << position;
        int ans = (BitMask & num); // do bitwise AND operation in get bit
        System.out.println(ans); // if output is non zero then bit is 1 else bit at that position is 0
        if (ans==0){
            System.out.println("Bit at position "+position+" is 0");
        }
        else {
            System.out.println("Bit at position "+position+" is 1");
        }

    }
}
