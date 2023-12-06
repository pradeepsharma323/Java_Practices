package collection_practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StingListToInteger {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("1","2","3","4","5");
        List<Integer> intList=stringList.stream()
                .map(Integer::valueOf)
                .collect(Collectors.toList());
        System.out.println(intList);

        // After Converting Check max and min integer value

        System.out.println(intList.stream()
                .max(Comparator.comparing(Integer::intValue))
                .get());
        System.out.println(intList.stream().min(Comparator.comparing(Integer::intValue)).get());

    }

}
