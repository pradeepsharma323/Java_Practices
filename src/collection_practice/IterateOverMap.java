package collection_practice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class IterateOverMap {
    public static void main(String[] args) {
      iterateMapWithDiffWays();
    }
    public static void iterateMapWithDiffWays(){
        Map<Integer, String> map = new HashMap<>();
        map.put(1,"Rahul");
        map.put(2,"Sumit");
        map.put(3,"Vikas");
        map.put(4,"Krishan");
        map.put(5,"Deepak");
        map.put(6,"sandeep");

        // iterate through iterator
        Iterator iterator= map.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry key =(Map.Entry)iterator.next();
            //String value =(String) iterator.next();
            System.out.println("Printing key :"+key.getKey()+"::::"+"Value is:"+key.getValue());

        }
        System.out.println("-------------------------------------------------------");

        // iterate through for loop
        System.out.println("Iterating through for loop");
        for(Map.Entry<Integer,String> entry : map.entrySet()){

            System.out.println("Key :"+entry.getKey()+"::::"+"Value is:"+entry.getValue());
        }

        System.out.println("-------------------------------------------------------");
        // iterate through lambda expression
        System.out.println("Iterating through eachForLoop");
        map.entrySet().stream().forEach(entry-> System.out.println("Key:"+entry.getKey()+"------"+"Value:"+entry.getValue()));
    }
}
