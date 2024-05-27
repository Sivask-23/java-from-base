public class basicprblms {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        b = ++a; // increment first and use
        System.out.println(a);
        System.out.println(b);
        b = a++; // use first and then increment
        System.out.println(a);
        System.out.println(b);
        System.out.println();
//        relational operators
        System.out.println("Relational operators");
        System.out.println(a == b);
        System.out.println(a >= b);
        System.out.println(a <= b);
        System.out.println(a != b);
        System.out.println();
//        logical operators
        System.out.println("logical operators");
        System.out.println(a >= b || a <= b);
        System.out.println(a >= b && a <= b); // this result can make opposite by adding not operator "!"
        System.out.println(!(a >= b && a <= b));
    }
}
