package collection_practice;

import java.util.ArrayList;
import java.util.List;

public class ConvertArrayListStringToArray {

    public static void main(String[] args) {
        List<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("Shiv");
        stringArrayList.add("Mahakal");
        stringArrayList.add("Vishwanaath");
        stringArrayList.add("kashi");

        //.1 Solution

        //String [] stringArray = new String[stringArrayList.size()];
        /*for (int i=0; i<stringArrayList.size(); i++){
            stringArray[i]= stringArrayList.get(i);
        }
        for(String s:stringArray){
        System.out.println("String array value is:"+s);}*/

        //2. Solution
        /*String [] stringArray= stringArrayList.stream().toArray(String[]::new);
        for(String s:stringArray){
            System.out.println("String array value is:"+s);}*/

        //3. Solution
        String [] stringArray3=stringArrayList.toArray(new String [stringArrayList.size()]);
        for(String s:stringArray3){
            System.out.println("String array 3rd solution is:"+s);}
    }
}
