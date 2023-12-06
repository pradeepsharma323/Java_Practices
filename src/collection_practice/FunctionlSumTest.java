package collection_practice;

@FunctionalInterface
interface Math {
    int doMath(int value1, int value2);
    default String truncate(Integer value1, Integer value2){
        Integer out = value1 + value2;
        return out.toString().substring(0,1);
    }
     /*String truncate(Integer value1, Integer value2){
        Integer out = value1 + value2;
        return out.toString().substring(0,1);
    }*/
    /*String truncate(int value1, int value2);
    default int doMath(int value1, int value2){
        return value1+ value2;
    }*/

}

public class FunctionlSumTest {
    public static void main(String[] args) {
        Math m = ((value1, value2) -> value1 + value2);
        System.out.println(m.doMath(5,6));
        System.out.println(m.truncate(5,6));
    }
}
