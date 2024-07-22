public class HCfandLcm {
    public static int gcdOfNum(int num1, int num2) {
        int low = (num1 < num2) ? num1 : num2;
        while (low > 0) {
            if (num1 % low == 0 && num2 % low == 0){
                break;
            }
            low--;
        }
        return low;
    }

    public static void main(String[] args) {

        int a=3;
        int b=8;
        int gcd=gcdOfNum(a,b);
        int lcm=(a*b)/gcd;
        System.out.println("GCD is : "+gcd);
        System.out.println("LCM is : "+lcm);

    }
}
