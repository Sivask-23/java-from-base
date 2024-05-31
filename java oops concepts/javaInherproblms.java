
class Shape {
    String color;

    public void area() {
        System.out.println("displays area");
    }
}

class Triangle extends Shape { // single level inheritance
    public void printInfo() {
        System.out.println("Triangle color is " + this.color);
    }
}

class Square extends Triangle {   // multilevel inheritance

    public void area(int l) {
        System.out.println("Area of square is " + (l * l));
    }

}

class Circle extends Shape {  // hierarchical inheritance
    public void area(int r) {
        System.out.println("Area of circle is " + (3.14 * (r * r)));
    }
}

public class javaInherproblms {
    public static void main(String[] args) {

        Triangle t1 = new Triangle();
        t1.color = "red";
        t1.printInfo();
        t1.area();
        Square s1 = new Square();
        s1.area(5);
        Circle c1 = new Circle();
        c1.area(5);



    }
}
