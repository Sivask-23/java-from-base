import java.util.Scanner;

public class tryoutCasting {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        float a=sc.nextFloat();
//        System.out.println(a);

//        type casting
        int num=(int)(654.76f);
        System.out.println(num);

//        byte level
        int ab=258;
        byte b=(byte) (ab);
        System.out.println(b); // byte can store up to 256 only so 256 % 258 => 2 

    }
}
