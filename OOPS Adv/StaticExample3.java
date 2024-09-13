public class StaticExample3 {
    void printMsg(){
        System.out.println("I am from non static method");
        printMsg1(); // can be used bcs non-static context can be able to reference static ones
    }
    static void printMsg1(){
        System.out.println("I am from static method");
    }
    public static void main(String[] args) {

        printMsg1();
//        printMsg(); cannot be accessed bcs of non-static method which trying to access from static context
        StaticExample3 obj=new StaticExample3();
        obj.printMsg(); // we can access non-static methods using objects inside static context

    }
}
