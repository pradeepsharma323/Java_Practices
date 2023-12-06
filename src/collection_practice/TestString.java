package collection_practice;

import java.util.Arrays;
import java.util.List;

public class TestString {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("dog","over","good");
        list.stream().reduce((x1,x2)-> x1.length()> x2.length()?x1:x2).ifPresent(System.out::println);
        System.out.println(list.stream().reduce(new String(),(x1,x2)-> { if(x1.equals("dog"))return x1; return x2;}));
        list.stream().reduce((x1,x2)-> x1.length()==3?x1:x2).ifPresent(System.out::println);
       //System.out.println(list.stream().reduce(new Character(),(x1,x2)-> x1+x2.charAt(0),(c1, c2) -> c1+=c2));
        System.out.println(list.stream().reduce(new String(),(x1,x2)-> x1+x2.charAt(0),(c1, c2) -> c1+=c2));
    }
}
