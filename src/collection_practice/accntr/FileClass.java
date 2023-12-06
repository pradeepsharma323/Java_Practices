package collection_practice.accntr;

import java.io.*;
import java.util.Optional;

public class FileClass {
    public static void main(String[] args) throws FileNotFoundException {
        Optional<String> f = Optional.of("file1.java");
        File f1= new File(f.get());
        Reader iout = new FileReader(f1);
        FileOutputStream iout1 = new FileOutputStream(f1);
       // RandomAccessFile rf = new RandomAccessFile(f1);
        // its an abstract class so instance can't be InputStream inputStream = new InputStream()
        InputStream inputStream = new FileInputStream(f1);
    }
}
