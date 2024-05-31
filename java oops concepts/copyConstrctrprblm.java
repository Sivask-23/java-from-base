class Stud {
    String name;
    String place;

    Stud(Stud s2) { // copy constructor
        this.name = s2.name;
        this.place = s2.place;
    }

    Stud() { // this is to initialise values to class members without copy constructors

    }

    public void printInfo() {
        System.out.println(this.name + " lives in " + this.place);
    }
}

public class copyConstrctrprblm {
    public static void main(String[] args) {
        Stud s1 = new Stud();
        s1.name = "sk";
        s1.place = "nemom";
        Stud s2 = new Stud(s1);
        s2.printInfo();
        s1.printInfo();
        s1.name = "ram";
        s2.printInfo();
        s1.printInfo();


    }
}
