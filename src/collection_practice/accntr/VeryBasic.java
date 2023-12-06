package collection_practice.accntr;

public class VeryBasic {
    public static void main(String[] args) {
        /*int c= 0;
        System.out.println((0==++c)? "true":"false");
        Double d= null;
        System.out.println((d instanceof Double)? "true":"false");
        boolean b = false;
        System.out.println((b=true)? "true":"false");
        String e ="1";
        System.out.println(("1"!=e)? "true":"false");
        int a =0;
        System.out.println((~a==0)? "true":"false");*/


        Integer i = new Integer(121);
        Integer j = new Integer(121);

        if(i==j){
            System.out.println("Both are equal");
        }else {
            System.out.println("Both are diff");
        }
    }
}
