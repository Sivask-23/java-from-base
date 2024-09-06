public class CountOfBits {
    public static void main(String[] args) {
        int n=8;
        System.out.println(Integer.toBinaryString(n));
        int count=0;
        int base=2;
        while (n>0){
            count++;
            n=n>>1;
        }
        System.out.println(count);
    }
}
