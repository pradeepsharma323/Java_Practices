package collection_practice;

public class ArrayCommonElement {
    public static void main(String[] args) {
        int ar1[] = { 1, 5, 10, 20, 40, 80 };
        int ar2[] = { 6, 7, 20, 80, 100 };
        int ar3[] = { 3, 4, 15, 20, 30, 70, 80, 120 };

        //System.out.print("Common elements are ");
        findCommonElement(ar1, ar2, ar3);

    }

    public static int[] findCommonElement(int[] aa1,int[] aa2,int[] aa3){
        int i=0,j=0, k=0;

        int [] findCommonArr = new int[aa1.length];
        while (i<aa1.length && j<aa2.length && k<aa3.length){
            if(aa1[i] == aa2[j] && aa2[j] == aa3[k]){

                    findCommonArr[i]= aa1[i];
                System.out.println("Print common element in Array:"+findCommonArr[i]);
                i++;
                j++;
                k++;
            }
            else if (aa1[i] < aa2[j])
                i++;

                // y < z
            else if (aa2[j] < aa3[k])
                j++;

                // We reach here when x > y and z < y, i.e., z
                // is smallest
            else
                k++;

        }
        //System.out.println("Print common element in Array"+findCommonArr[f]);
        return findCommonArr;
    }
}
