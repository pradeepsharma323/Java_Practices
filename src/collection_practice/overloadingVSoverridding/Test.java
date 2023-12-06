package collection_practice.overloadingVSoverridding;

class Base
{
    public void baseMethod()
    {
        System.out.println("BaseMethod called ...");
    }
}
class Derived extends Base
{
    public void baseMethod()
    {
        System.out.println("Derived method called ...");
    }
}
public class Test
{
    public static void main (String args[])
    {
        Base b = new Derived();
        b.baseMethod();

        // Note if we removed base class method and try to run . we see compilation error.
        // since compiler check baseMethod in baseClass first. then compile
        // at runtime it check whether baseMethod overridden by child class or not. if overridden then call child method .
        // otherwise call base class method

    }
}

