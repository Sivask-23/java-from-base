import java.util.Scanner;

public class Switchprblm1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter num:");
        int a = sc.nextInt();
        switch (a){
            case 1:
                System.out.println("ok");
                break;
            case 2:
                System.out.println("you");
                break;
            case 3:
                System.out.println("done well");
                break;
            default:
                System.out.println("Please enter valid key");
        }
    }
}
