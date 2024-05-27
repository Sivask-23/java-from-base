import java.util.Scanner;

public class bitUpdateoprtn {
    public static void  clearOper(int n, int p){
        int num=n;
        int pos=p;

        int bitmask= 1<<pos;
        int notofBitmask = ~(bitmask);

        int ans= (num & notofBitmask);

        System.out.println(ans);
    }
    public static void  setOper(int n, int p){
        int num=n;
        int pos=p;

        int bitmask=1<<pos;

        int ans=bitmask|num;

        System.out.println(ans);
    }
    public static void main(String[] args) {
        int num,pos,op;
        Scanner sc=new Scanner(System.in);

        do {
            System.out.println("Enter num");
            num= sc.nextInt();
            System.out.println("Enter pos");
            pos= sc.nextInt();
            System.out.println("Which value to update [1/0]..or press 2 to exit and 3 to continue");
            op=sc.nextInt();
            if (op==1){
                clearOper(num,pos);
            } else if (op==0) {
                setOper(num,pos);
            }else if (op==2){
                System.exit(1);
            }

        }while (op==3);

    }
}
