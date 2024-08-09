public class PermutationOfStrings {
    static void permOfString(String str,String ans){
        if (str.isEmpty()){
            System.out.println(ans);
            return;
        }

        for (int i = 0; i < str.length() ; i++) {
            char curr=str.charAt(i);
            String newString=str.substring(0,i)+str.substring(i+1);
            permOfString(newString,ans+curr);
        }

    }
    public static void main(String[] args) {

        String str="abc";
        System.out.println(str.substring(0,1)+str.substring(2));
        permOfString(str,"");


    }
}
