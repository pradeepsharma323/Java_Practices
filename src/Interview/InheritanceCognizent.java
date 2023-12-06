package Interview;


class A {
    public A(){
        System.out.println("A");
    }
}

class B extends A {

    public B(){
        System.out.println("B");
    }

}
public class InheritanceCognizent {
    public static void main(String[] args) {
        new B();
    }
}
