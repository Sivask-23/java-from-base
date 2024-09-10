public class Shifting {
    public static void main(String[] args) {
        int num = 10;
        int ans = num << 1; // here doing left shift by 1
        System.out.println(ans); // left shift by 1 gives n => 2n ans ans

//         a << b => a * 2 ^ b

        int a = 5;
        int b = 3;
        System.out.println(a << b); // (5 * (2 ^ 3)) => (5*8) =>40
    }
}
