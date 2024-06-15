public class addStarstoString {
    public static void main(String[] args) {
        String str="spacing";
        char [] star={0,1,2,3,4,5,6};
        String ans="";
        int j=0;
        for (int i = 0; i < str.length(); i++) {
            if (j<star.length && i==star[j]){
                ans+="*";
                j++;
            }
            ans+=str.charAt(i);
        }
        System.out.println(ans);
    }
}
