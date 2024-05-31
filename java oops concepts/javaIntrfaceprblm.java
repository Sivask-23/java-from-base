interface Animals { // cannot create constructors for interface
    void walk(); // should not contain implementation details
                            // all fields in interface are public, static, and final by default
//    void eats();
    int eyes=2; // its static by default cannot be changed by any derived class objects

}

interface Herbivore{

    void eats(); // declare here and implement in derived classes

}

class Hen implements Animals, Herbivore{
    public void walk(){
        System.out.println("have 2 legs");
    }
    public void eats(){
        System.out.println("eat plants");
    }

}
public class javaIntrfaceprblm {
    public static void main(String[] args) {

        Hen h1=new Hen();
        h1.walk();
        h1.eats();


    }
}
