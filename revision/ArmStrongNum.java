public class ArmStrongNum {
    public static int countofNum(int n) {
        int count = 0;
        while (n > 0) {
            count++;
            n = n / 10;
        }
        return count;
    }

    public static int poOfNum(int base, int p) {
        int ans = 1;
        for (int i = 0; i < p; i++) {
            ans = ans * base;
        }
        return ans;

    }

    public static void main(String[] args) {
        int num = 123;
        int ans = 0;
        int c=countofNum(num);
        while (num > 0) {

            int r = num % 10;
            ans=ans+poOfNum(r,c);
            num=num/10;

        }
        System.out.println(ans);
    }
}
