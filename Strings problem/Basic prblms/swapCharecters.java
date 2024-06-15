public class swapCharecters {
    public static void main(String[] args) {
        String str="ABCDE";
        StringBuilder sb=new StringBuilder(str);
        int b=10;
        int c=6;
        for (int i = 0; i < b; i++) {
            int j=i%str.length();
            int r=(j+c)%str.length();
            char t=sb.charAt(j);
            sb.setCharAt(j,sb.charAt(r));
            sb.setCharAt(r,t);
        }
        System.out.println(sb);
    }
}
