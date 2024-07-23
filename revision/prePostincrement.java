public class prePostincrement {
    public static void main(String[] args) {
        int a=5;
        int b=a++;
        System.out.println("after post increment");
        System.out.println(b);
        System.out.println(a);
        a=++b;

        System.out.println("after pre increment");
        System.out.println(a);
        System.out.println(b);
    }
}
