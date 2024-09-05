public class CheckPowerOf2OrNot {
    public static void main(String[] args) {
        int num=7;
        int temp=num;
        int count=0;
        while (num>0){
            int lastDigit=num&1;
            if(lastDigit==1){
                count++;
            }
            num=num>>1;
        }
        String str = (count == 1) ? "yes power of 2" : "Not a power of 2";
        System.out.println(str);

//        Another method

        int ans=(temp & (temp-1));
        if (ans==0){
            System.out.println("yes power of 2 is right using method 2");
        }
        else {
            System.out.println("Not a power of 2 using method 2");
        }
    }
}
