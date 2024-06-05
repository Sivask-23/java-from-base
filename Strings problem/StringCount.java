public class StringCount {
    public static void main(String[] args) {
        String str="CAAABBCZ";
        char [] ar=new char[26];
        String res="";
        for (int i = 0; i < ar.length; i++) {
            ar[i]=(char)('A'+i);
        }
        for (int i = 0; i < ar.length; i++) {
            int count=0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j)==ar[i]){
                    count++;
                }
            }
            if (count!=0){
                res+=ar[i];
                res+=count;
            }
        }
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i]);
        }
        System.out.println();
        System.out.println(res);
    }
}
