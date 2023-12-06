package collection_practice;

public class GenericMethod {
    public static void main(String[] args) {
        genericMethod(10);
        genericMethod("String");
    }

    static <E> void genericMethod(E type) {
        System.out.println("Generic Method called :"+type.getClass().getName()+"::"+type);

    }
}