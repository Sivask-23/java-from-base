import java.util.Arrays;

public class VariablelenArgs {
    static void print(int ...v){
        System.out.println(Arrays.toString(v));
    }
    static void printStr(String ...s){
        System.out.println(Arrays.toString(s));
    }
    public static void main(String[] args) {
        print(1,2,3,4,5,6,7,8,9);
        printStr("s","i","v","a","Kumar","S");
    }
}
