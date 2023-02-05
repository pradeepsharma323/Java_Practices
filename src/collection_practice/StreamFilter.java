package collection_practice;

import java.util.ArrayList;
import java.util.List;

public class StreamFilter {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(10);
        integerList.add(11);
        integerList.add(24);
        integerList.add(34);
        integerList.add(45);
        integerList.stream().filter(x-> x>20).forEach(x->System.out.println("Print greater than 20 value:"+x));
    }
}
