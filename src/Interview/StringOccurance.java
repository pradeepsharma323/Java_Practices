package Interview;

import javax.swing.text.DateFormatter;
import java.text.DateFormat;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringOccurance {

    public static void main(String[] args) {
        List<String> lst = List.of("Delhi","Delhi","Indore","Pune","Pune","Pune");

        lst.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
                //.entrySet().stream().filter(e->e.getValue()==1).map(Map.Entry::getKey);

        lst.stream().filter(e-> e.startsWith("D")).collect(Collectors.toList());
        //System.out.println("Append Mr. at begining:"+name);
        int a[]= new int[4];

        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        long [] ab ={1,3,4,5};
         getCustomer("one", ab);
    }

    public static void getCustomer(String Id, long...customerNumber){
        System.out.println("print ID and Number"+Id+":"+customerNumber);
    }

}
