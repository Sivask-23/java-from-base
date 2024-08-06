// program to count number of steps needed to reduce to zero
// in one step, if the current number is even, divide it by 2,
// otherwise subtract 1 from it

public class NoofSteps {
    static int numberOfSteps(int value, int steps){
        if (value==0){
            return steps;
        }
        if (value%2==0){
            return numberOfSteps(value/2,steps+1);
        }else {
            return numberOfSteps(value-1,steps+1);
        }
    }
    public static void main(String[] args) {
        int num=8;
        System.out.println("number of steps is "+numberOfSteps(num,0));
    }
}
