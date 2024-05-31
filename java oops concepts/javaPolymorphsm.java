class Stud1 {
    String name;
    int age;

    public void printInfo(String name) {
        System.out.println(this.name);
    }

    public void printInfo(int age) {              // compile time polymorphism | same name different parameter
        System.out.println(this.age);
    }

    public void printInfo(String name, int age) {
        System.out.println(this.name + " " + this.age);
    }
}

public class javaPolymorphsm {
    public static void main(String[] args) {

        Stud1 s1 = new Stud1();
        Stud1 s2 = new Stud1();
        s1.name = "Sk";
        s1.age = 23;
        s2.age = 20;
        s2.name = "AS";
        s1.printInfo(s1.age);
        s1.printInfo(s1.name);
        s2.printInfo(s2.name, s2.age);

    }
}
