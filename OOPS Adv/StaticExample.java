public class StaticExample {

//    create class called human
    public static class Human{
        int age;
        String name;
        int salary;
        boolean married;
        static int population;

//        creating constructor
    public Human(int age, String name, int salary, boolean married) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        Human.population+=1;
    }
    public Human(){
        Human.population+=1;
    }
}
}
