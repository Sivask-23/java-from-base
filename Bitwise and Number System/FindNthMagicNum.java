public class FindNthMagicNum {
    public static void main(String[] args) {
         int n=5;
         int ans=0;
         int a=5;
         while (n>0){
             int lastDigit=n&1;
             ans+=lastDigit * a;
             n=n>>1;
             a=a*5;
         }
        System.out.println(ans);
    }
}
