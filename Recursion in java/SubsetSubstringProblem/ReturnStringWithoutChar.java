public class ReturnStringWithoutChar {
    static String withoutChar(String str,char a, String ans){

        if (str.isEmpty()){
            return ans;
        }
        if (str.charAt(0)== a){
            return withoutChar(str.substring(1), a, ans);
        }else {
            ans+=str.charAt(0);
            return withoutChar(str.substring(1),a,ans);
        }
    }
//    method 2 without passing argument to store answer

    static String method2(String str){
        if (str.isEmpty()){
            return "";
        }
        char ch=str.charAt(0);
        if (ch=='a'){
            return method2(str.substring(1));
        }else {
            return ch + method2(str.substring(1));
        }
    }
    public static void main(String[] args) {
        String str="baccad";
        System.out.println(withoutChar(str,'a',""));
        System.out.println("method 2");
        System.out.println(method2("banana"));
    }
}
