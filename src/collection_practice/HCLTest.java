package collection_practice;

import java.util.*;
import java.util.stream.Collectors;

public class HCLTest {

    public static void main(String[] args) {
        String str = "Big black bug bit a big black dog on his big black dog nose";
        //what to find the duplicate from given string
        Set<String> strSet= new HashSet();

        Arrays.stream(str.split(" "))
                .filter(str1->!strSet.add(str1))
                .collect(Collectors.toSet()).forEach(System.out::println);

        // above was HCL question below is mine for practice

        List<Integer> arrList = Arrays.asList(new Integer[]{0, 1, 1, 2, 1, 0, 0, 2});

        Collections.sort(arrList);
        Set<Integer> setExample = new HashSet(arrList);
        System.out.println(setExample);

        // sum of all array element

        Integer [] arr = {2,3,4,5};
        Integer sumOfArrayElement=Arrays.stream(arr).collect(Collectors.summingInt(Integer::intValue));
        System.out.println("Sum of all array element:"+sumOfArrayElement);

        // if given array is in string

        String arr1[] = {"2","3","4","5","6"};

        // First way
        Integer stringArraySum=Arrays.stream(arr1).map(Integer::valueOf).collect(Collectors.summingInt(Integer::intValue));
        System.out.println("Print String array sum:"+stringArraySum);

        //second way
        List<Integer> intList = new ArrayList<>();
        for (String s: arr1){
            intList.add(Integer.valueOf(s));
        }
        intList.stream().collect(Collectors.summingInt(Integer::intValue));

        // if we have like

        String strNumber ="2341";
        Integer splitString=Arrays.stream(strNumber.split("")).map(Integer::valueOf).collect(Collectors.summingInt(Integer::intValue));
        System.out.println("Print Split String Sum:"+splitString);

    }
}
