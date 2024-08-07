public class ReverseANumber {

    static int sum=0;
    static int revUsingRec(int num){
        if (num==0){
            return sum;
        }
        sum= sum * 10 + (num%10);
        return revUsingRec(num/10);
    }
    static boolean isPalindrome(int num){
        return num==sum;
    }
    public static void main(String[] args) {
        int num=12121;
        System.out.println(revUsingRec(num));
        System.out.println(isPalindrome(num));
    }
}
