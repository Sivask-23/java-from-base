public class BintoDecimal {
    public static int powerOfNum(int base, int p){
        int res=1;
        for (int i = 0; i < p; i++) {
            res*=base;
        }
        return res;
    }
    public static void main(String[] args) {
        String binaryString="0101";
        int ans=0;
        int length=binaryString.length();
        for (int i = 0; i < binaryString.length(); i++) {
            if (binaryString.charAt(length-1-i)=='1'){
                ans=ans+powerOfNum(2,i);
            }
        }
        System.out.println(ans);
    }
}
