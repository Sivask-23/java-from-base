public class StaticExampleUsage {
    public static void main(String[] args) {
        StaticExample.Human h1=new StaticExample.Human(22,"Siva",20000,false);
        StaticExample.Human h2=new StaticExample.Human(24,"Sivask",40000,false);
        StaticExample.Human h3=new StaticExample.Human(); // empty constructor with increased population
        h3.name="sera";
        System.out.println(h2.name);
        System.out.println(h1.married);
        System.out.println(StaticExample.Human.population);
        System.out.println(StaticExample.Human.population);
        System.out.println(StaticExample.Human.population);
    }
}
