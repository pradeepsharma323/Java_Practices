package Interview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class PersistentClass {
    public static void main(String[] args) {
        System.out.println("Hello World");
        String str = "Hello world";
        System.out.println(str);  //vowel count

        int count =0;
        Map<String,Integer> map = new HashMap<>();
        for(int i =0; i<str.length();i++){

            switch (str.charAt(i)){
                case 'a':
                    //count++;
                    map.put("a",count++);
                    //System.out.println("a count is:"+count);
                case 'e':
                    /*count++;
                    System.out.println("e count is:"+count);*/
                    map.put("e",count++);
                case 'i':
                    /*count++;
                    System.out.println("i count is:"+count);*/
                    map.put("i",count++);
                case 'o':
                    /*count++;
                    System.out.println("o count is:"+count);*/
                    map.put("o",count++);
                case 'u':
                    /*count++;
                    System.out.println("u count is:"+count);*/
                    map.put("u",count++);
            }
        }
        System.out.println(map);

       /* MyInterface m1 = () -> "Pradeep";
        System.out.println(m1.sayHello());
        Consumer<String> st = (s) -> s.length();
        st.accept("Persistent");

        Supplier<String> sp = () -> "Persist";
        sp.get();*/
    }
}


interface MyInterface {
    String sayHello();
}



