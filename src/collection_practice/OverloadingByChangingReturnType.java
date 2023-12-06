package collection_practice;

public class OverloadingByChangingReturnType {
/*
    int addTwoNumber(int a, long b){
        return (int) (a+b);
    }
    // here diff return type may have issue  let say 1: is int, 2: double then compileation err.
    int addTwoNumber(long a, int b){
        return (int) (a + b);
    }*/

    // method overloading achive 1. by changing number of arguments 2. by changing arguments data type.
    static int add(long a,long b){
        System.out.println("Long method called");
        return (int) (a+b);
    }
    static double add(int a,int b){
        return a+b;
    }
    public static void main(String[] args){
        System.out.println(OverloadingByChangingReturnType.add(11,11));//ambiguity
    }}



