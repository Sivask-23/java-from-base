public class revANum {
    public static void main(String[] args) {
        int num=1212;
        int temp=num;
        int ans=0;
        while (num>0){
            int r=num%10;
            ans=ans*10+r;
            num=num/10;
        }
        System.out.println(ans);
        if (ans==temp){
            System.out.println("palindrome");
        }
    }
}
