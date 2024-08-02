public class exmple1Immutable {
    public static void main(String[] args) {

        String str="Siva";
        String str1="Siva";
        System.out.println(str==str1); // true bcs both are referring to same object

        String str3=new String("Siva");
        System.out.println(str==str3);
        System.out.println("values are equal "+str.equals(str3));


    }
}
