class Students {
    String name;
    int age;

    public void printInfo() {
        System.out.println("Name is " + this.name + " having age " + this.age);
    }

    Students(String name1, int age1) { // parameterised constructor
        System.out.println("Constructor called");
        this.name = name1;
        this.age = age1;
    }

}

public class constrctproblems {
    public static void main(String[] args) {

        Students s1 = new Students("Siva", 22); // parameterised constructor
        s1.printInfo();

    }
}
