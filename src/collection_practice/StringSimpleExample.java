package collection_practice;

public class StringSimpleExample {
    public static void main(String[] args) {
        String s1="HelloWorld";
        String s2="HelloWorld";

        String s3="helloWorld";
        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s2==s3);
        System.out.println(s1.equalsIgnoreCase(s3));
    }
}
