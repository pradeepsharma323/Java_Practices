package collection_practice;

public class TryWithReturn
{
    public static void main(String args[])
    {
        System.out.println(TryWithReturn.test());
    }

    public static String test()
    {
        try {
            System.out.println("try");
            //throw new Exception();
            return "Inside try return";
        } catch(Exception e) {
            System.out.println("catch");
            return "return";
        } finally {
            System.out.println("finally");
            return "return in finally";
        }
    }
}