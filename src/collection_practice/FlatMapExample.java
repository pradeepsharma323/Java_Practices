package collection_practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapExample {
    public static void main(String[] args) {
        List<Integer> one = Arrays.asList(4,5,6,6,7);
        List<Integer> two = Arrays.asList(1,2,3);
        List<Integer> three = Arrays.asList(8,9,10,11,12);
        List <Integer> finalList=Stream.of(one,two,three).flatMap(list -> list.stream()).collect(Collectors.toList());
        System.out.println(finalList);
    }
}
