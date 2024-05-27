import java.util.Scanner;

public class Switchprblm2 {
    public static void main(String[] args) {
        int n1,n2;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Char:");
        char a = sc.next().charAt(0);
        switch (a){
            case '+' :
                System.out.println("num1: ");
                n1=sc.nextInt();
                System.out.println("num2: ");
                n2=sc.nextInt();
                System.out.println("Sum is "+(n1+n2));
                break;
            case '-' :
                System.out.println("num1: ");
                n1=sc.nextInt();
                System.out.println("num2: ");
                n2=sc.nextInt();
                System.out.println("Result is "+(n1-n2));
                break;
            case '*' :
                System.out.println("num1: ");
                n1=sc.nextInt();
                System.out.println("num2: ");
                n2=sc.nextInt();
                System.out.println("Result is "+(n1*n2));
                break;
            case '/' :
                System.out.println("num1: ");
                n1=sc.nextInt();
                System.out.println("num2: ");
                n2=sc.nextInt();
                System.out.println("Result is "+(n1/n2));
                break;
            case '%' :
                System.out.println("num1: ");
                n1=sc.nextInt();
                System.out.println("num2: ");
                n2=sc.nextInt();
                System.out.println("Result is "+(n1%n2));
                break;
            default:
                System.out.println("press valid key");
        }
    }
}
