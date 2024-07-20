public class constVariable {
   private static final int MAX=10;
    public static void main(String[] args) {
        int a=6;
        System.out.println(MAX+a);
        variables2 v2=new variables2();
        v2.newValue();
        System.out.println(MAX+1);
    }
}
class variables2{
    private static final int MAX=5;
    void newValue(){
        System.out.println("new value of max : "+MAX);
    }
}
