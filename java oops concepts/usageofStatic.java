class Member{
    String name;
    static String place="ok";
    public static void printInfo(){ // can only be accessed by class rather than objects bcz of static 
        System.out.println(place);
    }
}
public class usageofStatic {
    public static void main(String[] args) {
        Member m1=new Member();
        m1.name="sk";
        Member.place="Nemom"; // cannot be instantiated by object bcs place is static
        Member.printInfo();
    }
}
