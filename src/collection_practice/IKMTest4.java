package collection_practice;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.Collection;
import java.util.Formatter;
import java.util.function.BiFunction;

public class IKMTest4 {
    public static void main(String[] args) {
        String stringA = "A";
        String stringB = "B";
        String stringNull = "null";
        StringBuffer stringBuffer = new StringBuffer("C");
        Formatter fmt = new Formatter(stringBuffer);
        fmt.format("%s%s", stringA,stringB);
        System.out.println("Line 1:"+fmt);
        fmt.format("%-2s",stringB);
        System.out.println("Line 2:"+fmt);
        fmt.format("%b",stringNull);
        System.out.println("Line 3:"+fmt);

    }

}
