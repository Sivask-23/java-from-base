import java.util.Scanner;

public class introProblm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] marks = new int[5];
        System.out.println("Enter marks one by one");
        for (int i = 0; i < marks.length; i++) {
            marks[i] = sc.nextInt();
        }
        for (int i = 0; i < marks.length; i++) {
            System.out.println("marks[" + i + "]=>" + marks[i]);
        }
        int [] mark={10,20,30,32};
        for (int j : mark) {
            System.out.println(j);
        }
    }
}
