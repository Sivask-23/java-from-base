public class FnsAndMethods {
    static int val;
    public static void addSum(int a, int b){
        System.out.println("value of local variables in fn a is "+a+" and b is "+b);
        System.out.println("Sum is "+(a+b));
    }
    public static void changeValue(int v){
        val=v+10;
    }
    public static void main(String[] args) {
        int a=10;
        int b=5;
        val=10;
        addSum(10,10);
        System.out.println("value of a is "+a+" and b is "+b);
        changeValue(val);
        System.out.println(val);

    }
}
