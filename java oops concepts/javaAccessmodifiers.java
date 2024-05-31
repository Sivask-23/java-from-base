class Account{
    String name;
    private String pass;

//    getters and setters method used to access private methods and members


    public String getPass() {
        return this.pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
}
public class javaAccessmodifiers {
    public static void main(String[] args) {
        Account a1=new Account();
        a1.name="Siva";
        a1.setPass("abcd");
        System.out.println(a1.getPass());


    }
}
