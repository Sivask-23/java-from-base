public class bitGetoprtn {
    public static void main(String[] args) {
        int num = 5;
        int pos=2;

//        in get operation perform bit mask first
        int bitmask= 1<<pos;
//         then do AND
        if ((bitmask & num)==0){
            System.out.println("Bit was 0");
        }else {
            System.out.println("Bit was 1");
        }
    }
}
