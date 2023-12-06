package collection_practice.conversion;

public class ReplaceCharAtIndex {
    public static void main(String[] args) {
        String originalString = "CloudUK";
        System.out.println(getReplacedString(originalString,'U',3));

    }
    static String getReplacedString(String s, char c, int index){
       return s.replace(s.charAt(index),c);
    }
}
