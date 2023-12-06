package collection_practice.accntr;

import java.io.File;
import java.util.Locale;

public class FileManage {
    public static void main(String[] args) {
        File file = new File("text.txt");
        File backup = new File("text.txt.bck");
        backup.delete();
        file.renameTo(backup);
        Locale locale = new Locale.Builder().setLanguage("en").setRegion("GB").build();
        Locale la= Locale.forLanguageTag("zh-CN");
       /* int c= 0;
        System.out.println((0==++c)? "true":"false");*/

        //Locale laa = new Locale();
        Locale l = Locale.US;
        //Locale l = new Locale("en","US",true);
    }
}
