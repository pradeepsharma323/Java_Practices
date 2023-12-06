package collection_practice;

import java.util.concurrent.Flow;

interface Java8MethodRef{
    void say(String s);
}

public class MethodReference {
    public static void main(String[] args) {

        // Referecne to a static method
        Java8MethodRef java8MethodRef1=MethodReference::saySomething;
        java8MethodRef1.say("");

        // Reference to a instance method
        Java8MethodRef java8MethodRef=new MethodReference()::sayNothing;
        java8MethodRef.say("Nothing");

        // using lambda
        Java8MethodRef jd = (s) -> System.out.println("print :" + s);
        jd.say("Lambda function called");
    }
    public static void saySomething(String s){
        System.out.println("Static Method reference calling...");
    }

    public void sayNothing(String s){
        System.out.println("Instance Method reference calling...");
    }
}
