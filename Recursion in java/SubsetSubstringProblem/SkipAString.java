public class SkipAString {
    static String skipAWord(String str){
        if (str.isEmpty()){
            return "";
        }
        char ch=str.charAt(0);
        if (str.startsWith("apple")){
            return skipAWord(str.substring(5));
        }else {
            return ch + skipAWord(str.substring(1));
        }
    }
    public static void main(String[] args) {
        System.out.println(skipAWord("catappledog"));

    }
}
