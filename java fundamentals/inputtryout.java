import java.util.Scanner;

public class inputtryout {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name here:");
        String name= sc.nextLine();
        System.out.println("Welcome "+name);

        // using next
        System.out.print("Enter your name here:");
        String fname= sc.next();
        System.out.println("Welcome "+fname);
    }
}
