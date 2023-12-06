package collection_practice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.net.Inet4Address;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

public class TestIKM {
    /*void display(){
        System.out.println("data"+data);
    }
    int data;*/

    public static void main(String[] args) {
        /*int x=5;
        TestIKM t= new TestIKM();
        t.display();*/
        System.out.println(new SimpleDateFormat("yyyy-MM-DD").format(new Date()));
       System.out.println(DateFormat.getDateInstance().toString());
        System.out.println(LocalDate.now().format(DateTimeFormatter.ISO_LOCAL_DATE));
        System.out.println(DateFormat.getDateInstance(DateFormat.SHORT).format(new Date()));
        //System.out.println(new LocalDate().format(DateTimeFormatter.ISO_LOCAL_DATE));

       /* BufferedReader bufferedReader = new BufferedReader(new InputStreamReader("input.dat"));
       FileReader fileReader = new FileReader("input.dat");
        BufferedReader bufferedReader1 = new BufferedReader(fileReader);
        BufferedReader bufferedReader2 = new BufferedReader(new FileReader("input.date"));*/
       /*int va=25;
        Integer before= va;
        Long after = ++before == 26?5: new Long(10);
        System.out.println(after.intValue() - before.intValue());*/
    }
}
