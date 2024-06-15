public class removeAllOccurance {
    public static void main(String[] args) {
        String str="sivakumar";
        char c='a';
        String ans="";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)==c){
                continue;
            }else {
                ans+=str.charAt(i);
            }
        }
        System.out.println(ans);
    }
}
