package collection_practice.accntr;

public class MainA {
    public static void main(String[] args) {
        System.out.println("Class A"+args[0]);
    }
}
class MainB {
    public static void main(String[] args) {
        System.out.println("Class B");
        MainA.main(args);
    }
}
