import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
class monster{
    int power;
    int bonus;

    monster(int power,int bonus){
        this.power=power;
        this.bonus=bonus;
    }
}
public class RPGgame {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int defeated=0;
        System.out.println("Enter number of monsters");
        int n=sc.nextInt();
        System.out.println("Enter initial experience");
        int ip=sc.nextInt();
        int[]power=new int[n];
        System.out.println("Enter monster power ");
        for (int i = 0; i < n; i++) {
            power[i]=sc.nextInt();
        }
        int[]bonus=new int[n];
        System.out.println("Enter bonus");
        for (int i = 0; i < n; i++) {
            bonus[i]=sc.nextInt();
        }

        monster[] monsters=new monster[n];
        for (int i = 0; i < n; i++) {
            monsters[i]=new monster(power[i],bonus[i]);
        }

        Arrays.sort(monsters, Comparator.comparingInt((monster m)->m.power));
        for (monster m: monsters){
            System.out.println("Power of monster is "+m.power+" and "+"bonus is "+m.bonus);
        }

        for (monster m : monsters){
            if (ip>=m.power){
                ip+=m.bonus;
                defeated++;
            }else {
                break;
            }
        }
        System.out.println("defeated "+defeated+" monsters");
    }
}
