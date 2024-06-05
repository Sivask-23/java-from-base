public class aditionofStrings {
    public static void main(String[] args) {
        String f="abz";
        char[] alpha=new char[26];
        String res="";
        for (int i = 0; i < alpha.length; i++) {
            alpha[i]=(char)('a'+i);
        }

        for (int i = 0; i < alpha.length; i++) {
            System.out.print(alpha[i]+" ");
        }
        System.out.println();
        int num=10;
        String ab=Character.toString(alpha[(25+num)%26]);
        ab+=alpha[(2+num)%26];
        System.out.println(ab);

        for (int i = 0; i < f.length(); i++) {
            char curChar=f.charAt(i);
            for (int j = 0; j < alpha.length; j++) {
                if (curChar==alpha[j]){
                   res+=Character.toString(alpha[(j+num)%26]);
                   break;
                }
            }
        }
        System.out.println(res);
    }
}
