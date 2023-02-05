package collection_practice;

import java.util.ArrayList;
import java.util.List;

public class SimpleSubString {
    public static void main(String[] args) {
        String s = "Pradeep";
        System.out.println(s.length());
        System.out.println(s.substring(0,s.length()));
        char c =' ';

        //reverse string
        //String[] total = new String[s.length()];
        List<Character> charList = new ArrayList<>();
        for (int i=s.length()-1; i>=0; i--) {
             c = s.charAt(i);
             //addChar(c);
            //String.valueOf(c);
             //total[i] = String.valueOf(c);
           // char [] total = new char[s.length()];
            charList.add(c);
            System.out.println(String.valueOf(c));
        }
        System.out.println("Reverse String is :"+charList);

    }
    /*public static char[] addChar(char ad) {
        char[] total = new char[0];
        total=total+ad;
      return total;
    }*/

}
