public class bitClearoprtn {
    public static void main(String[] args) {
        int num=5;
        int pos=2;

        int bitmask= 1<<pos;
        int notofBitmask = ~(bitmask);

        int ans= (num & notofBitmask);

        System.out.println(ans);
    }
}
