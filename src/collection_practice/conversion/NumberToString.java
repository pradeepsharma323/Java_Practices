package collection_practice.conversion;

public class NumberToString {
    public static void main(String[] args) {
        int number= 122456;
        String st = String.valueOf(number);
        for (int i=0;i<st.length(); i++){
            switch (st.charAt(i)){
                case '1':
                    System.out.println("One");
                    break;
                case '2':
                    System.out.println("Two");
                    break;
                case '3':
                    System.out.println("Three");
                    break;
                case '4':
                    System.out.println("Four");
                    break;
                case '5':
                    System.out.println("Five");
                    break;
                case '6':
                    System.out.println("Six");
                    break;
                case '7':
                    System.out.println("Seven");
                    break;
            }
        }
    }
}
