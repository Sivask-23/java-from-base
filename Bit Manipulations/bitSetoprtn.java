public class bitSetoprtn {
    public static void main(String[] args) {
        int num=5;
        int pos=1;

        int bitmask=1<<pos;

        int ans=bitmask|num;

        System.out.println(ans);
    }
}
