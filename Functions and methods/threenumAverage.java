import java.util.Scanner;

public class threenumAverage {
    public static float printAverage(int n1, int n2, int n3) {

        return (float) (n1 + n2 + n3) / 3;

    }

    public static void main(String[] args) {
        int n1, n2, n3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Num1");
        n1 = sc.nextInt();
        System.out.println("Enter Num2");
        n2 = sc.nextInt();
        System.out.println("Enter Num3");
        n3 = sc.nextInt();
        System.out.println("Average of three numbers is: " + printAverage(n1, n2, n3));
    }
}
