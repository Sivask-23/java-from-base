import java.util.Scanner;

public class IfElseprbloms {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age:");
        int age=sc.nextInt();
        if (age > 18){
            System.out.println("Eligible for voterID");
        }
        else {
            System.out.println("Not eligible for voterID");
        }
    }
}
