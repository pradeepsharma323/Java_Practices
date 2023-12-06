package collection_practice.overloadingVSoverridding;

interface second{
    void second1();
}

interface third{
    void third1();
}

interface first{
    void a();
    void b();
    void c();
    void d();
    void e();
}
 //  here in abstract class we can implements any method as we can see below
// but in derived class we have to implemesnt all method if we are going to extends Abst class.
// an abstract class can implements multiple interfaces.


abstract class Abst implements first {
    @Override
    public void a() {
        System.out.println("inside abstract class");
    }

   public class AbstractAndInterface extends Abst {

       @Override
       public void b() {

       }

       @Override
       public void c() {

       }

       @Override
       public void d() {

       }

       @Override
       public void e() {

       }
   }
}
