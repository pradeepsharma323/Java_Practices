package collection_practice;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.*;

public class Test {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3));
        for (int i=1; i<=3; i++){
            list.add(i);
            Spliterator<Integer> split = list.spliterator();
            split.forEachRemaining(z-> System.out.println(z+" "));
        }
    }
}
