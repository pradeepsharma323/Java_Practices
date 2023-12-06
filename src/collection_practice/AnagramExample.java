package collection_practice;

import java.util.Arrays;

public class AnagramExample {

    public static void main(String[] args) {
        boolean isTrue=isAnagram("night", "thing"); // this is case censative.
        System.out.println("Is given value Anagram :"+isTrue);
    }

    public static boolean isAnagram(String first, String second){
        char [] firstArray = first.toCharArray();
        char [] secondArray = second.toCharArray();

        Arrays.sort(firstArray);
        Arrays.sort(secondArray);
        return Arrays.equals(firstArray,secondArray);
    }
}
