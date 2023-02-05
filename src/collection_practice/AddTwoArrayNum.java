package collection_practice;

import java.util.HashMap;
import java.util.Map;

public class AddTwoArrayNum {
    public static void main(String[] args) {
     AddTwoArrayNum addTwo = new AddTwoArrayNum();
     int[] arr = {2,7,11,15,10};
     //int printArr[]=addTwo.addTwoArrayNum(arr,18);
     //System.out.println("Some of two ArrayNumber:"+printArr);
        int printArr[]=addTwo.twoSum(arr,9);
        System.out.println("Some of two ArrayNumber:"+printArr);
    }
    public int[] addTwoArrayNum(int [] arr, int target) {
        int[] returnArray= new int[10];
        int count = 0;  // value may come like arr = [2,7,11,15,10]
        for(int i=0; arr.length-1>i; i++) {
             for (int j=i+1; arr.length>j; j++) {
                 if (target == arr[i]+arr[j]) {
                     count++;
                     returnArray[i] = arr[i];
                     returnArray[count] = arr[j];
                     return returnArray;

                 }
             }
        }
        return returnArray;
    }

    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            if(map.containsKey(target - nums[i])){
                result[1] = i;
                result[0] = map.get(target - nums[i]);
                break;
            }
            map.put(nums[i],i);
        }

        return result;
    }
}
