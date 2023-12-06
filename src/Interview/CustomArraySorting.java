package Interview;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CustomArraySorting {

    public static void main(String[] args) {

        /*Predicate<String> p = (t) -> t.isEmpty();

        p.test("Vikas");*/

        List<Integer> list = Arrays.asList(new Integer[]{6,7,8,9,7,6});
        Set<Integer> set = new HashSet();

        //Set<Integer> uniqueList=list.stream().filter(x->!set.add(x)).collect(Collectors.toSet());  // [8,9]
        Set<Integer> uniqueList=list.stream().distinct().collect(Collectors.toSet());  // need this [8,9]
         Integer sumOfElements=list.stream().collect(Collectors.summingInt(Integer::intValue));
        System.out.println("Cognizent List"+uniqueList);
        System.out.println("Sum of list elements"+sumOfElements);


        Integer a[] = new Integer[]{6,2,2,2,6,2,6,4,3};
        // 0,1,0,1,0,1,1 timeCompliexity shoudn't be o(n)
       Map<Integer, Long> map= Arrays.stream(a).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
      //List<Integer> list=map.keySet().stream().collect(Collectors.toList());
        List<Integer>  list1 =Arrays.asList(new Integer[]{6,2,2,2,6,2,6,4,3});//new ArrayList<>(List.of(6,2,2,2,6,2,6,4,3));
        list1.sort(Comparator.comparingInt(i-> Collections.frequency(list1, i)).reversed());
        System.out.println("*********************"+list1);
        //Arrays.sort(aa);
        //System.out.println("---------"+ Arrays.stream(aa).toList());//

       /*List<Integer> list=map.entrySet().stream().filter(x->x.getValue()>map.size())
               .map(Map.Entry::getKey).
               collect(Collectors.toList());*/
        /*int count =0;
        for(int i=0; i<a.length; i++){
            if(a)
        }*/

        //list.stream().filter(x->x.intValue()>)
        //System.out.println(list);  // [6, 6, 6, 4, 4, 3, 2]
    }
}
