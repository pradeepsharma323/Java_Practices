package collection_practice.protectTest;
interface High{
    default void method1(){
        System.out.println("Method1");
    }
    public abstract void method2();
}
 public class Middle implements High {

     @Override
     public void method2() {
         System.out.println("Middle Class Method 2");
     }

     // Can access own package and by subclass of its class in another package.
     // meaning same package and outside package only if its subclass.
     protected static void method3(){
         System.out.println("Middle method 3");
     }
     private void method4(){
         System.out.println("Middle method 4");
     }
 }

class Child extends Middle{

    public static void main(String[] args) {
        //Child child = new Child();
       /* Middle test = new Middle();
        test.method1();
        test.method2();
        Middle.method3();*/

        String a = new String("hello-string");
        String b= "hello-string";
        String c = a.intern(); // intern method basically create an exact copy of String object in heap and store it into scp, but it
        // first check whether same string exist in scp then point same to reference otherwise create new reference.
        String d = b.intern();
        System.out.println(a==b); // false
        System.out.println(b==c); // true
        System.out.println(a==c); // false
        System.out.println(a.hashCode()==c.hashCode()); //true since both will point to same memory location.
        System.out.println(d==b); // true
        System.out.println(d==c); // true

    }
}