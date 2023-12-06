package collection_practice;

public class GenericClass<T> {
    T obj;
    public GenericClass(T obj){
        this.obj = obj;
    }

    public T getObj() {
        return obj;
    }

    public static void main(String[] args) {
        GenericClass<Integer> gc = new GenericClass<>(10); // Here we are passing integer value
        GenericClass<String> gcStr = new GenericClass<>("String"); // Here able to pass String value.
        System.out.println("Generic Example print :"+gc.getObj().getClass().getName()+":"+gc);
        System.out.println("Generic Example print :"+gcStr.getObj().getClass().getName()+":"+gcStr);


        //Note we can have reference type Generic i.e Generic<Integer> but can't Generic<int>
        // but have Generic<int []> type because array is reference type.

        // Means Generic work only with reference types:

        // 1 . Code reuse ability
        // 2. prevent from TypeCast error i.e classCastException
    }
}
