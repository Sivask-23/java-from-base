import java.util.Scanner;

public class countOccurences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, count = 0, n;
        System.out.println("Enter number");
        num = sc.nextInt();
        System.out.println("which number to check ?");
        n = sc.nextInt();
        while (num != 0) {
            int lastDigit = num % 10;
            if (lastDigit == n) {
                count++;
            }
            num = num / 10;
        }
        System.out.println("Occurrence of " + n + " is " + count + " times");
    }
}
