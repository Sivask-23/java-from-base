import java.util.Scanner;

public class Patterns {
    public static void main(String[] args) {
        int r = 4;
        int c = 5;
        int n = 5;
        int choice;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ur choice");
        choice = sc.nextInt();
        switch (choice) {
            case 1:// pattern 1
                for (int i = 0; i < r; i++) {
                    for (int j = 0; j < c; j++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
                break;

            case 2:// border pattern

                for (int i = 1; i <= r; i++) {
                    for (int j = 1; j <= c; j++) {
                        if (i == 1 || i == r || j == 1 || j == c) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    }
                    System.out.println();
                }
                break;

            case 3: // pattern 3
                for (int i = 1; i <= n; i++) {
                    for (int j = 0; j < i; j++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
                break;

            case 4: // pattern 4

                for (int i = 0; i < n; i++) {
                    for (int j = n; j > i ; j--) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
                break;


            case 5: // pattern 5


                for (int i = 1; i <= n; i++) {

                    // print spaces
                    for (int j = n; j > i ; j--) {
                        System.out.print(" ");
                    }

                    // print stars
                    for (int j = 1; j <= i; j++) {
                        System.out.print("*");
                    }

                    System.out.println();

                }

                break;


            default:
                System.out.println("invalid key");
        }
    }
}
