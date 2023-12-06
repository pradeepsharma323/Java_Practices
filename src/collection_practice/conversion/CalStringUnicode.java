package collection_practice.conversion;

public class CalStringUnicode {
    public static void main(String[] args) {
        String st = "Pradeep";
        for (int i=0;i<st.length();i++){
            System.out.println("String char is"+"---"+st.charAt(i)+"----And Unicode value is:---"+st.codePointAt(i));
        }
    }
}
