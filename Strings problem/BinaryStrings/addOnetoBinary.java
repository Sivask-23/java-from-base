
public class addOnetoBinary {
    public static void main(String[] args) {
        String str="10011";
        for (int i = str.length()-1; i >=0; i--) {
            if (str.charAt(i)=='0'){
                str=str.substring(0,i)+'1'+str.substring(i+1);
                break;
            }else {
                str=str.substring(0,i)+'0'+str.substring(i+1);
            }
        }
        System.out.println(str);
    }
}
