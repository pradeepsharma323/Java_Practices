package collection_practice;

import java.util.ArrayList;

public class SimpleArrayList {

    public void printArrayList(ArrayList arrayList){
        System.out.println(arrayList);
    }

    public void addElementToArrayList(){
        ArrayList arrayList = new ArrayList();
        arrayList.add("AMEX");
        arrayList.add("wipro");
        arrayList.add("TCS");
        arrayList.add("Infy");
        printArrayList(arrayList);

    }
    public static void main(String[] args) {
        SimpleArrayList simpleArrayList =new SimpleArrayList();
        simpleArrayList.addElementToArrayList();
    }
}
