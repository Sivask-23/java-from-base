public class SingletonEx {
    private SingletonEx(){

    }
    private static SingletonEx instance;

    public static SingletonEx getInstance(){
        if (instance==null){
            instance=new SingletonEx();
        }
        return instance;
    }
}
