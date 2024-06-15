public class sortcharinString {
    public static void main(String[] args) {
        String str="feergwrthrthdfghcbaaa";
        StringBuilder sb=new StringBuilder(str);
        for (int i = 0; i < str.length()-1; i++) {
            for (int j = 0; j < str.length()-1-i; j++) {
                if (sb.charAt(j)>=sb.charAt(j+1)){
                    char t= sb.charAt(j);
                    sb.setCharAt(j, sb.charAt(j+1));
                    sb.setCharAt(j+1,t);
                }
            }
        }

        System.out.println(sb);

    }
}
