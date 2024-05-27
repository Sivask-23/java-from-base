import java.util.Scanner;

public class Elseifprblm1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter num:");
        int a = sc.nextInt();
        if (a==1){
            System.out.println("U pressed 1");
        } else if (a==2) {
            System.out.println("U pressed 2");
        } else if (a==3) {
            System.out.println("u pressed 3");
        } else {
            System.out.println("U pressed invalid Key");
        }
    }
}
