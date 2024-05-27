import java.util.Scanner;

public class Problem1 {
    public static void printMyname(String name) {
        System.out.println("Your name is: " + name);
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String fname = sc.nextLine();
        printMyname(fname);
        System.out.println("Thank you");
    }
}
