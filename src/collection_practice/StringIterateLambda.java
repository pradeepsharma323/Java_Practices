package collection_practice;

import java.util.Arrays;
import java.util.List;

public class StringIterateLambda {

    public static void main(String[] args) {
        List<String> names= Arrays.asList("Gagan","Gaurav","Gurpreet","Sahil","Gungun");
        names.stream().
                filter(nam -> nam.startsWith("S"))
                .forEach(StringIterateLambda::printMsg);
        //na -> System.out.println("Name Start with G:"+na

    }

    public static void printMsg(String s) {
        System.out.println("Print name start with:"+s);
    }


}
