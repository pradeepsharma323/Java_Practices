package collection_practice;

public class IKMTest1 {
    private static int count;
    static {
        System.out.println("in block 1");
        count=10;
    }
    private int[] data;
    {
        System.out.println("in block 2");
        data = new int[count];
        for(int i=0; i<count; i++){
            data[i] =i;

        }
    }

    public static void main(String[] args) {
        System.out.println("count"+count);
        System.out.println("Before 1st call to new");
        IKMTest1 ikmTest1 = new IKMTest1();
        System.out.println("Before 2nd call to new");
        IKMTest1 ikmTest12= new IKMTest1();
    }
}
