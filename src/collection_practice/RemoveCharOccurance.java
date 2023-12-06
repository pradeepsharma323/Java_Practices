package collection_practice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RemoveCharOccurance {

    public static void main(String[] args) {
        String str= "Pradeep Sharma";
        //System.out.println("Removed char:" +removedGivenChar(str,'a'));
        System.out.println("Removed char:" +countGivenChar(str,'a'));
        //using lambda function each char occurance
        String[] split = str.split("");

        //Stream.of(split).  this also work
        Map<String, Long> map=Arrays.stream(split).
                collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println("Print Each char occurance with count:"+map);

        // print only duplicate char

        List<String> dupl=Arrays.stream(split).
                collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet().stream()
                .filter(k-> k.getValue()>1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
        System.out.println("Print duplicate char:"+dupl);

    }

    /*public static String removedGivenChar(String st, char c){
        int l = st.length();
        String removedStr="";
        for(int i=0; i<l; i++){
            if(st.charAt(i)!=c){
                removedStr = removedStr + st.charAt(i);

            }
        }
        return removedStr;

    }*/

    public static String countGivenChar(String st, char c){
        int l = st.length();
        String countStr="";
        int count =0;
        for(int i=0; i<l; i++){
            if(st.charAt(i)==c){
                countStr = countStr + st.charAt(i);
                count++;

            }
        }
        System.out.println("Repeated string is:"+countStr+"-----"+"Cound is:"+count);
        return countStr;

    }
    // using lambda function

}
