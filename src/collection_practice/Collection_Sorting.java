package collection_practice;

import java.util.ArrayList;
import java.util.Collections;

public class Collection_Sorting {
    public static void main(String[] args) {
        ArrayList<User> userArrayList = new ArrayList<>();
        userArrayList.add(new User("Vikas","Delhi",29));
        userArrayList.add(new User("Sumit","Meerut",23));
        userArrayList.add(new User("Ravi","mumbai",24));
        userArrayList.add(new User("Ram","Noida",34));
        System.out.println("Print ArrayList Before Sorting:"+userArrayList);
        Collections.sort(userArrayList);
        userArrayList.forEach((printUser -> System.out.println("After Sorting based on Name List is:"+printUser)));
    }
}
