public class revAnumber {
    public static void main(String[] args) {
        int num = 1224;
        int ans = 0;
        while (num != 0) {
            int lastDigit = num % 10;
            ans = ans * 10 + lastDigit;
            num = num / 10;
        }
        System.out.println(ans);
    }
}
