package collection_practice.accntr;

public class Shape<T extends Number, Comparable> {
    private T acc;
    public void add (T newType){acc = newType;};
    public T get() {return acc;};

}
class Quad extends Shape {}
class Triangle extends Shape {};

class Main1 {
    public static void main(String[] args) {
        Shape shape = new Quad();
        Quad quad = new Quad();
        Triangle triangle = (Triangle) shape;
        //Triangle tri =(Triangle) Quad;
        //Shape tri =(Triangle) Shape;
        shape = quad;
        Shape tri1 = quad;
    }
}
