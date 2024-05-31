//class name should start with capital letter and
//functions name should start with lowercase or camel type
class Pen {
    String color;
    String type;

    public void write() {
        System.out.println("writing with " + this.color + " ink with " + this.type + " pen");
//        this operator will work based on the object which is calling the class and its methods
    }
}

class Student {
    String name;
    int age;

    public void printInfo() {
        System.out.println("Name is " + this.name + " having age " + this.age);
    }

}

public class oopsproblem {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.color = "blue";
        p1.type = "Ball";
        Pen p2 = new Pen();
        p2.color = "Black";
        p2.type = "Gel";
        p1.write();
        p2.write();

        Student s1 = new Student(); // Constructors, this is non parametrised constructor
        s1.name = "Siva";
        s1.age = 24;
        s1.printInfo();
        s1.age = 23;
        s1.printInfo();

    }
}
