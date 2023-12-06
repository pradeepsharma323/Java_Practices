package collection_practice;

import java.util.Locale;
import java.util.Optional;

public class OptionalClassEmp {

    public static void main(String[] args) {
        String[] st = new String[10];
        st[5]= "String is present at index";
        //Optional.ofNullable(st[5]).ifPresent(System.out::println);  // This will not pring nothing if st[5] is blank
        Optional<String> opt=Optional.ofNullable(st[5]);
        if (opt.isPresent()) {
            System.out.println(st[5].toLowerCase());
        }
        else System.out.println("String not present at this index");
    }
}
