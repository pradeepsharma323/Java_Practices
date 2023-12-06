package collection_practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FindSmallestAndLargestNumber {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,8);
        /*System.out.println("Printing Smallest Number:"+getSmallest(list));
        System.out.println("Printing Largest Number:"+getLargest(list));*/
        int max =list.stream().collect(Collectors.summarizingInt(Integer::intValue)).getMax();
        int min =list.stream().collect(Collectors.summarizingInt(Integer::intValue)).getMin();
        System.out.println("Print max using lambda:"+max);
        System.out.println("Print min using lambda:"+min);
    }

    public static int getSmallest(List<Integer> a){
        int min =a.get(0);
        int arrSize = a.size();
        for(int i=1; i<arrSize; i++){
            if(a.get(i)<min){
                min = a.get(i);
            }
        }
        return min;
    }

    public static int getLargest(List<Integer> a){
        int max =a.get(0);
        int arrSize = a.size();
        for(int i=1; i<arrSize; i++){
            if(a.get(i)>max){
                max = a.get(i);
            }
        }
        return max;
    }

}
