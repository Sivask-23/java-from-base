import java.util.Scanner;

public class enhancedSwitchExample {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter day");
        int day= sc.nextInt();
        switch (day){
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("friday");
//            or we can do like this
//            case 1,2,3,4,5 -> System.out.println("week days");
            case 6,7 -> System.out.println("weekend");
            default -> System.out.println("Enter value between1 and 7");
        }
    }
}
