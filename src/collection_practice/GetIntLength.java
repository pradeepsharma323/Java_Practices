package collection_practice;

public class GetIntLength {

    public static void main(String[] args) {
        int i= 12345;

        // This is one Way

        /*String s = Integer.toString(i);
        System.out.println("Print int length:"+s.length());*/

        //Second way
        int count = 0;
        while(i>0){
            count++;
            i = i/10;
        }
        System.out.println("Print int length:"+count);
    }
}
