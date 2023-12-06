package collection_practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class IntegerArrayToString {

    public static void main(String[] args) {
        Integer arrInt[] = {12,13,14,15,6};
        List<String> strList = new ArrayList<>();
        for (Integer i : arrInt) {
            strList.add(String.valueOf(i));
            //System.out.println(String.valueOf(i));
        }
        System.out.println("Print converted String List:"+strList);

        // Using lambda
        Arrays.stream(arrInt).map(String::valueOf).collect(Collectors.toList()).forEach(System.out::println);
    }

}
