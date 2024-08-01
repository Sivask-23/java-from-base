public class alphabets {
    public static void main(String[] args) {
        StringBuilder alpha= new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char al=(char)('a'+i);
            alpha.append(al);
        }
        System.out.println(alpha);
    }
}
