public class FindIthIndexCharInABinaryString {
    public static String convertDecimalToBinary(int num){
        StringBuilder res =new StringBuilder();
        while (num!=0){

            res.append(num%2);
            num=num/2;

        }
        res.reverse();
        return res.toString();
    }
    public static void main(String[] args) {
        int m=3;
        int n=3;
        int k=6;
        String binary="";
        String res="";
        binary+=convertDecimalToBinary(m);
        System.out.println(binary);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < binary.length(); j++) {
                if (binary.charAt(j)=='0'){
                    res+="01";
                }else {
                    res+="10";
                }
            }
            binary=res;
            res="";
        }
        System.out.println(binary);
        System.out.println(binary.charAt(k));


    }
}
