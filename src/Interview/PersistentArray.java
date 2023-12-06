package Interview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PersistentArray {

    public static void main(String[] args) {

        int aa[] = {2345,33,35,313,7333,64,1233};
        getOccurance(aa,3);

    }


    public static void getOccurance(int a[], int value) {

        // Printing each of element inside array using stream

        Arrays.stream(a).forEach(System.out::println);

        //First convert int to string array
         String strArr[] = new String[a.length];
        for(int i=0; i<a.length;i++){
            strArr[i]=String.valueOf(a[i]);
        }

        System.out.println("-----------"+Arrays.toString(strArr)+"------Size is:"+strArr.length);
        //Now check Occurance of 3 in each index inside StrArray.

        for(int index=0;index<strArr.length;index++){
            //if (value==strArr[index].charAt(index)){
                System.out.println("Match Char is:"+strArr[index].charAt(index));

            //}
        }

    }
}
