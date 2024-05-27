import java.util.Scanner;

public class Ifelseprblm2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Entr num1:");
        int a = sc.nextInt();
        System.out.println("Entr num2:");
        int b = sc.nextInt();
        if (a == b ){
            System.out.println("same");
        } else {
            if (a < b) {
                System.out.println(b + " is greater");
            } else {
                System.out.println(b + " is lesser");
            }
        }
    }
}
