package collection_practice;

public class LengthOfLastWord {
    public static void main(String[] args) {

        LengthOfLastWord lengthlstWrd = new LengthOfLastWord();
        String aa =lengthlstWrd.returnLastWord("Hello World");
        System.out.println("Last Word is:"+aa+":length is:"+aa.length());
    }

    public String returnLastWord(String input) {
        String[] arr = input.split(" ");
        String returnLastString= arr[arr.length-1];
        return returnLastString;
    }
}
