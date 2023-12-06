package collection_practice.conversion;

import java.util.Arrays;

public class SortString {
    public static void main(String[] args) {
        String str= "JavaStringPractice";
        System.out.println("Sorted String is as:--"+returnSortedString(str));
    }
    static String returnSortedString(String string){
        char[] chars=string.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
}
