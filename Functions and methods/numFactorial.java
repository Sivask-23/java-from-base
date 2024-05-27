import java.util.Scanner;

public class numFactorial {
    public static int printFact(int n, int res){
        if (n<0){
            return 0;
        }
        for (int i=1;i<=n;i++){
            res=res*i;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Num");
        int n1= sc.nextInt();
        int res=1;
        if (printFact(n1,res)==0){
            System.out.println("Try again");
        }
        else {
            System.out.println("factorial of given number is : " + printFact(n1, res));
        }
    }
}
