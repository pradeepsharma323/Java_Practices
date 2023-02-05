package collection_practice;

import java.util.Arrays;

public class FindKthSmallestValue {
    public static void main(String[] args) {
       int k= getKthSmallestValue(new int[]{2,4,9,6,7},3);
       System.out.println("Kth smallest value is:"+k);
    }
    public static int getKthSmallestValue(int[] arr, int kthValue){
        Arrays.sort(arr);
        System.out.println("After sorting array is:"+arr);
       // int kth = ;
        return arr[kthValue -1];
    }

}
