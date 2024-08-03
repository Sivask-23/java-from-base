// print hello world five times
public class BasicProblem1 {
    static void printMsg(String msg,int times){

        if (times==0){
            return;
        }

        System.out.println(msg);
        times--;
        printMsg(msg,times);
        System.out.println(times);
    }
    public static void main(String[] args) {

        printMsg("Hello world",5);
    }
}
