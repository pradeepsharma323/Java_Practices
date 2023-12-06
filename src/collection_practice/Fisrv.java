package collection_practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Fisrv {

    public static void main(String[] args) {
        List<String> nameList = Arrays.asList("Pradeep","Vikas","Sumit","Vinod");
        nameList.stream().filter(nm->nm.startsWith("P")).
                filter(nm2->nm2.contains("a")).collect(Collectors.toList()).forEach(System.out::println);
    }


}
