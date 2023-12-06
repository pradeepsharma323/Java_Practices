package collection_practice;

import java.util.Arrays;

public class FindKthLargestValue {
    public static void main(String[] args) {
        int k= getKthLargestValue(new int[]{2,4,9,6,7},1);
        System.out.println("Kth Largest value is:"+k);
    }
    public static int getKthLargestValue(int[] arr, int kthValue) {
        Arrays.sort(arr);
        System.out.println("After sorting array is:"+arr);

        // int kth = ;
        return arr[arr.length -kthValue];
    }
}
