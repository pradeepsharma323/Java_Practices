package collection_practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class DuplicateItemInList {
    public static void main(String[] args) {
        List<Integer> duplicateList = Arrays.asList(11,12,11,23,23,21,54,65,54);
        HashSet<Integer> uniqueList = new HashSet<>();
        duplicateList.stream().filter(duplctlist-> !uniqueList.add(duplctlist))
                .forEach(uniqueLi -> System.out.println(uniqueLi));
    }

}
