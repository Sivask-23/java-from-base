public class bitWiseoprnts {
    public static void main(String[] args) {
        int a=5;
        int b=6;
        System.out.println(a^b); // binary XOR
        System.out.println(a&b); // binary AND
        System.out.println(a|b); // binary OR
        System.out.println(~a);  // one's complement 1 => 0, 0 => 1
        System.out.println();
//        binary left shift
        int pos=2;
        System.out.println(a<<pos); // number operator position
//        binary right shift
        System.out.println(a>>pos); // number operator position
    }
}
