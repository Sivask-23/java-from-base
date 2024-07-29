import java.util.Scanner;

public class nestedSwitchExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter employee id: ");
        int empID = sc.nextInt();
        String department = sc.next();
        switch (empID) {
            case 1 -> {
                System.out.println("Sivakumar s");
                switch (department) {
                    case "IT" -> System.out.println("IT department");
                    case "MD" -> System.out.println("Managing director");
                    default -> System.out.println("No department found");
                }
            }
            case 2 -> {
                System.out.println("Sooraj MS");
                switch (department) {
                    case "IT" -> System.out.println("IT department");
                    case "MD" -> System.out.println("Managing director");
                    default -> System.out.println("No department found");
                }
            }
            case 3 -> {
                System.out.println("Siva");
                switch (department) {
                    case "IT" -> System.out.println("IT department");
                    case "MD" -> System.out.println("Managing director");
                    default -> System.out.println("No department found");
                }
            }
            default -> System.out.println("invalid data");
        }
    }
}
