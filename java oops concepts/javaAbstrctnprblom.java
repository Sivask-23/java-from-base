abstract class Animal{  // should contain abstract fns also contain non abstract methods
                        // cannot be instantiated ie, cant create object for abstract class

    abstract void walk();
    Animal(){  // constructor chaining
        System.out.println("created animal");
    }
    public void eats(){
        System.out.println("Animal eats");
    }

}
class Horse extends Animal{
    public void walk(){
        System.out.println("Have 4 legs");
    }
    Horse(){
        System.out.println("Created horse");
    }
}
class Chicken extends Animal{
    public void walk(){
        System.out.println("Have 2 legs");
    }
}

public class javaAbstrctnprblom {
    public static void main(String[] args) {
        Horse h1=new Horse(); // it will invoke constructor of base class then only derived class constructor will invoke
        h1.walk();
        h1.eats();

    }
}
