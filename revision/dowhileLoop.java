import java.util.Scanner;

public class dowhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        do {
//            System.out.println("Enter num");
            num=sc.nextInt();
            if (num==0){
                System.out.println("gud bye from this loop");
            }else {
                System.out.println("u r in this loop");
            }
        }while(num!=0); // if u press 0 u will exit
    }
}
