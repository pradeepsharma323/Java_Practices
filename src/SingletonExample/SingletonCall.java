package SingletonExample;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

public class SingletonCall {
    public SingletonCall() throws ClassNotFoundException, NoSuchMethodException, IOException {
    }

    public static void main(String[] args) {
        SingletonDemoWithBreaking s1=SingletonDemoWithBreaking.getInstance();
        System.out.println("Singleton Original Object Created::"+s1.hashCode());
    }

    // Break Singleton
    //1. Reflection
     Class<?> singleTon = Class.forName("SingletonExample.SingletonDemoWithBreaking");
       Constructor constructors=  singleTon.getDeclaredConstructor();
       //constructors.setAccessible(true); // it will make the private constructor public
    //constructors.getInstance(); it will return the new instance of singleton class
    //2. Serialization

    //3. Cloneable
}
