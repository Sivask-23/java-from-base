import java.util.Scanner;

public class sumOfOdd {
    public static int sumOfoddnum(int n){
        int sum=0;
        for (int i=1;i<=n;i++){
            if (i%2!=0){
                sum=sum+i;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Range");
        n = sc.nextInt();
        System.out.println("Sum of odd numbers is: "+ sumOfoddnum(n));
    }
}
