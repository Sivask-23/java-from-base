public class SetupBit {
    public static void main(String[] args) {

        int num=5; //0101
        int pos=1;

        int bitMask= 1<< pos;
        int ans= num|bitMask;
        System.out.println(ans);
    }

}
