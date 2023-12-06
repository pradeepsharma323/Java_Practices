package collection_practice;

import java.util.*;

public class FindSecondLargestNumber
{

    public static void main(String[] args) {

        List<Integer> numList = Arrays.asList(23,34,54,54);
        Collections.sort(numList);
        int max = numList.get(numList.size()-2);
        //System.out.println("Largest Number in list:"+max);
        Set<Integer> set = new HashSet(numList);
        List<Integer> nonDuplicateList = new ArrayList<>();
        /*for (int i=0; i<numList.size(); i++){

        }*/

        for(Integer i: set)
        {
            nonDuplicateList.add(i);
            System.out.println(i);
        }
        Collections.sort(nonDuplicateList);
        int secondHigest = nonDuplicateList.get(nonDuplicateList.size()-2);
        System.out.println("Second Higest non Duplicate"+secondHigest);


        //using stream api
        Integer integer2 = numList.stream().max((x,y)->x.compareTo(y)).get();
        Integer integer3 = numList.stream().filter(x->x<integer2).max((x,y)->x.compareTo(y)).get();
        System.out.println("Lambda second higest number:"+integer3);

        int secondHigestInt=numList.stream().sorted(Comparator.reverseOrder()).distinct()
                .skip(1)
                .findFirst().get();
        System.out.println("Find second higest using stream:"+secondHigestInt);

        // nth higest

       // int highest = arr.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList()).get(n-1);

    }
}
