package collection_practice.accntr;

import java.util.Locale;

public class LocaleDemo {
    public static void main(String[] args) {
        Locale locale = Locale.US;
        System.out.println("Country: "+ locale.getCountry());
        System.out.println("Full Name: "+ locale.getDisplayCountry());
        System.out.println("Language: "+ locale.getLanguage());
        System.out.println("Full Language: "+ locale.getDisplayLanguage());
    }


}
