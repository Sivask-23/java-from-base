public class FindTheIthBitOfANUmber {
    public static void main(String[] args) {
        int num=5; // 0101
        int pos=1;
        int bitMask = 1<<pos;
        if ((num&bitMask)==0){
            System.out.println("element at given position is zero");
        }else {
            System.out.println("element at given position is one");
        }

    }
}
