import java.util.*;
public class noofPostandNeg {
    public static void countOfNum(){
        int p=0,n=0,z=0;
        int num;
        String choice;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter a number");
            num = sc.nextInt();

            if (num<0){
                n++;
            } else if (num==0) {
                z++;
            }else {
                p++;
            }

            System.out.println("do you want to enter more?[yes/no]");
            choice=sc.next();
        }while (choice.equalsIgnoreCase("yes"));

        System.out.println("No of positive numbers: "+p);
        System.out.println("No of negative numbers: "+n);
        System.out.println("No of zeros entered: "+z);
    }
    public static void main(String[] args) {
        countOfNum();

    }
}
