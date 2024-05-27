import java.util.Scanner;

public class powerRaisedtoNum {
    public static int printPower(int b, int e){
        int result=1;
        for (int i=1;i<=e;i++){
            result *=b;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base,exp;
        System.out.println("Enter base");
        base=sc.nextInt();
        System.out.println("Enter exponent");
        exp=sc.nextInt();
        System.out.println("Result of base^exp is:"+printPower(base,exp));
    }
}
