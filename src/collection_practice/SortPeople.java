package collection_practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortPeople {
    public static void main(String[] args) {
        System.out.println("Sorted array:"+sortPeople(new String[]{"Mary", "John", "Emma"}, new int[]{180, 165, 170}));
    }

    static String[] sortPeople(String[] names, int[] heights){
        /*String[] sortedPerson = new String[names.length];
        int small= heights[0];
        int[] max = new int[heights.length];
        for(int i =0; i< heights.length; i++){
            if(heights[i]>small){
                max[i] = heights[i];
            }
        }
        return sortedPerson;*/


        String [] res = new String[names.length];
        Map<Integer, String> map = new HashMap();

        for (int i = 0; i < names.length; i++) map.put(heights[i], names[i]);

        TreeMap<Integer,String> tm = new TreeMap<Integer,String>(map);

        int index = res.length - 1;
        for (Map.Entry<Integer, String> entry : tm.entrySet()) {
            res[index] = entry.getValue();
            index--;
        }
        return res;
    }
}
