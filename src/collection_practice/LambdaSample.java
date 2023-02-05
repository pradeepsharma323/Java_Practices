package collection_practice;

interface A {
    int aMethod(String s);
}

public class LambdaSample {
    public static void main(String[] args) {
       /*A a = new A() {
            @Override
            public int aMethod(String s) {
                return s.length();
            }
        };
        System.out.println(a.aMethod("called"));
        */

        // using lambda expression
        A a = s -> s.length();
        System.out.println(a.aMethod("Hello"));
    }
}
