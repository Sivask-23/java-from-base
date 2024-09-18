public class TryOut {
    public static void main(String[] args) {
        SingletonEx obj1=SingletonEx.getInstance();
        SingletonEx obj2=SingletonEx.getInstance();
        SingletonEx obj3=SingletonEx.getInstance();
        System.out.println(obj1);
        System.out.println(obj2);
        System.out.println(obj3);
    }
}
