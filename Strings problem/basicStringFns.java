import java.util.Scanner;

public class basicStringFns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String name=sc.nextLine();
//        System.out.println("Your name is:"+name);

//        Basic functions related to strings
         String fname="aello";
         String lname="cello";
         String fullname= fname+" "+lname;
        System.out.println(fullname);
        System.out.println(fullname.length());
        for (int i = 0; i < fullname.length(); i++) {
            System.out.print(fullname.charAt(i)+"->");
        }
        System.out.println();

//         compare
//        1 s1 > s2 : +ve value
//        2 s1 == s2 : 0
//        3 s1 < s2 : -ve value
//        aello cello here cello is greater bcz c has greater value

        if (fname.compareTo(lname)==0){
            System.out.println("strings are same");
        } else if (fname.compareTo(lname)>0) {
            System.out.println(fname+" is greater");
        }else {
            System.out.println(lname+ " is greater");
        }

//        Substrings

        String sentence="My name is Sivakumar";
        String name= sentence.substring(3,7); // start from 3 and till 6, 7 will not be included
        System.out.println(name);
        System.out.println(sentence.substring(11)); // beging is 11 and will print till last index by default



    }
}
