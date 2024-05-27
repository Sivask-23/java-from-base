import java.util.Scanner;

public class stringBuilderproblem {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        StringBuilder sb = new StringBuilder("Siva");
        System.out.println(sb);

//        char at index
        System.out.println(sb.charAt(0));
//        set char at index
        sb.setCharAt(3,'u');
        System.out.println(sb);
//        insert
        sb.insert(4,'S');
        System.out.println(sb);
//        deletion
        sb.delete(4,5); // here deleter from 4 to 4, 5 will not be considered
        System.out.println(sb);
//        add at end
        sb.append("kumar S"); // act as str = str+kumar S
        System.out.println(sb);
        sb.setCharAt(3,'a');
        System.out.println(sb);
//        length
        System.out.println("length: "+sb.length());
    }
}
