import java.util.Scanner;

public class revAstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string to reverse:");
        String name = sc.nextLine();
        StringBuilder sb = new StringBuilder(name);
//        lets reverse
        for (int i = 0; i < sb.length()/2; i++) {
//            lest find first and lst index of word
            int front = i;
            int back = sb.length() - 1 - i; // to find last index
//        lest find characters at first and last index
            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);
//        let's replace
            sb.setCharAt(front,backChar);
            sb.setCharAt(back,frontChar);
        }
        System.out.println(sb);
    }
}
