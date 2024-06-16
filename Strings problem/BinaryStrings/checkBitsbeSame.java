public class checkBitsbeSame {
    public static void main(String[] args) {
        String s1="100011";
        int c1=0;
        int c0=0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i)=='1'){
                c1++;
            }else {
                c0++;
            }
        }
        if (c1==1|| c0==1 ){
            System.out.println("yes possible");
        } else {
            System.out.println("Not possible");
        }
    }
}
