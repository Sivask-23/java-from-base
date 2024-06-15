public class equalityOfStrings {
    public static void main(String[] args) {
        String s1="hello world";
        s1=s1.replaceAll("\\s","");
        System.out.println(s1);
        String s2="helloworld";
        System.out.println(s1.equals(s2));
    }
}
