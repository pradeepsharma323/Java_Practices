package collection_practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DuplicateFromArray {
    public static void main(String[] args) {
        int a[] =new int[]{10,45,32,76,10,45};
        Set<Integer> intSet = new HashSet<>();
        Arrays.stream(a).filter(inte -> !intSet.add(inte)).
                forEach(s-> System.out.println("Duplicate value find:"+s));
        //Stream.of(a).filter(inte -> !intSet.add(inte)).forEach(s-> System.out.println(s));
        //System.out.println("Duplicate record :"+duplicateFound);


        Integer[] numbers = new Integer[] {10,45,32,76,10,45};
        Set<Integer> allItems = new HashSet<>();
        Set<Integer> duplicates = Arrays.stream(numbers)
                .filter(n -> !allItems.add(n)) //Set.add() returns false if the item was already in the set.
                .collect(Collectors.toSet());
        //System.out.println(duplicates);

       /* Integer[] intArr = {1,1,3,2,2,5,4,4,7,6,6,9,8,8,10,13};

        Set<Integer> result = Arrays.asList(intArr).stream().
                filter(x -> Collections.frequency(Arrays.asList(intArr), x) == 1).
                collect(Collectors.toSet());

        System.out.println(result);*/





    }
}
