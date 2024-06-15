public class freqOfAlbhabets {
    public static void main(String[] args) {
        String str = "sivakumars";
        for (char i = 'a'; i <= 'z'; i++) {
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (i == str.charAt(j)) {
                    count++;
                }
            }
            if (count > 0) {
                System.out.print(i +""+count+" ");
            }
        }
        System.out.println();

        int []ar=new int[26];
        for (int i = 0; i < str.length(); i++) {
            ar[str.charAt(i)-'a']++;
        }

        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i]);
        }
        System.out.println();
        System.out.println((char)(0+'a')+""+ar[0]);

        System.out.println('c'-'a');
    }
}
