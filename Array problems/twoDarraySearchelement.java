import java.util.Scanner;

public class twoDarraySearchelement {
    public static void main(String[] args) {
        int r=3 ,c=4;
        String choice;
        int [][] arr=new int[r][c];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter elements: ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j]= sc.nextInt();
            }
        }
        do {
            int ele,flag=0;
            System.out.println("Enter element to be searched: ");
            ele=sc.nextInt();
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    if (arr[i][j]==ele){
                        System.out.println("Element "+ele+" found at index arr["+i+"]"+"["+j+"]");
                        flag=1;
                        break;
                    }
                }
            }
            if (flag==0){
                System.out.println("Element not found, try again !");
            }
            System.out.println("search again? [y/n]");
            choice=sc.next();
        } while (choice.equalsIgnoreCase("y"));

    }
}
