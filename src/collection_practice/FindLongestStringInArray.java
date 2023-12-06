package collection_practice;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class FindLongestStringInArray {

    //find the highest String in given array with name and value
    public static void main(String[] args) {
        String[] str = {"JaiJaiMahakalShivShamboo","Java", "JavaTPoint","Shamboo","mahadev"};
        int max=0;
        String maxLengthString =null;
        for(String s: str){
            if (s.length()>max){
                max = s.length();
                maxLengthString = s;
            }
        }
        System.out.println("Print Max Length String:"+maxLengthString);

        //Using lambda
        System.out.println("Highest lenght String:--"+Stream.of(str).reduce((word1,word2) -> word1.length()>word2.length()?word1:word2).get());

        /*String first = str[0];
        String maxLength="";
        for (int i=0; i<str.length; i++){
            for (int j=i+1; j <str.length; j++) {
                if (first.length() < str[j].length()) {
                    maxLength = str[j];
                    //System.out.println(str[i]);
                }
            }

        }
        System.out.println(maxLength);*/
        /*Map<String, Integer> strMap = new HashMap<>();
        for(String i: str){
            strMap.put(i,i.length());
        }
        System.out.println(strMap);*/
    }
}
