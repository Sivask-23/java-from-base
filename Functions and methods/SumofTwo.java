import java.util.Scanner;

public class SumofTwo {
    public static int printSum(int n1, int n2) {
        return (n1 + n2);
    }

    public static int printMult(int n1, int n2) {
        return (n1 * n2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Num1");
        int n1 = sc.nextInt();
        System.out.println("Enter Num2");
        int n2 = sc.nextInt();
        System.out.println("Sum of two numbers is: " + printSum(n1, n2));
        System.out.println("Multiply result is :" + printMult(n1, n2));
    }
}
