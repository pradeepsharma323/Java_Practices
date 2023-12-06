package Interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Citius {

    public static void main(String[] args) {
        // Array == 1,4,5,7,1,0,10,11;

        // sort this once sort this  interate through array.
        // 0,1,1,4,5,7,10,11;  1-0 =1 same buget  1-1=0 same , 4-1 =3 <1 start new bucket

        // b1[0,1,1] b2[4,5] b3[7]......

        //List<String> arrayList = Arrays.asList("1","4","5","7","1","0","10","11");

        //for(String s : strList) intList.add(Integer.valueOf(s));

        //stringList.stream().map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> arrayList = Arrays.asList(1,4,5,7,1,0,10,11);
        //Collections.sort(arrayList,(i1,i2)-> Integer.valueOf(i1)>Integer.valueOf(i2)?:1);
        Collections.sort(arrayList);
        System.out.println("Sorted ArrayList is:"+arrayList);
        int count = 0;
        for(int i =0; i<arrayList.size();i++){

            // here we will get interger value one by one [0, 1, 1, 4, 5, 7, 10, 11]
            if(arrayList.get(i+1)-arrayList.get(i)<=1){
                count++;
            }
        }
        System.out.println("final count :"+count);




    }
}
