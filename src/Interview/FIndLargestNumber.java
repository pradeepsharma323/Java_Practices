package Interview;

import java.util.*;

public class FIndLargestNumber {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5,5,4);
        System.out.println("Print second largest value:" +getSecondLargestNumber(list));
        int a[] = {2,3,5,6,7,8};
        int secondLargest=getSecondLargestArray(a);
        System.out.println("Second Largest Number from Array:"+secondLargest);
    }

    public static int getSecondLargestArray(int a[]){
        Arrays.sort(a);
        return a[a.length-2];
    }


    public static int getSecondLargestNumber(List<Integer> list){
        //We need to find the second largest number
        Collections.sort(list); // 4,5,5
        List<Integer> newList = new ArrayList<>();
        Set<Integer> listSet = new HashSet<>(list); // 4,5
        for(int i: listSet){
            newList.add(i);
        }

        int secondLargest =newList.get(newList.size()-2);
        return secondLargest;

    }
}
