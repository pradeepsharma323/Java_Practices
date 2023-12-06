package collection_practice.accntr;

import java.util.Comparator;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class Transformat {
    static Integer transform(Integer i, Integer j,
                             BiFunction<Integer,Integer,Integer> f,
                             Function<Integer,Integer> g){
        return f.andThen(g).apply(i,j);
    }
    static Integer transform(Integer i, Integer j,
                             BinaryOperator<Integer> f){
        return f.apply(i,j);
    }
    static Integer func (Integer i, Integer j){
        return i-j;
    }

    public static void main(String[] args) {
        BiFunction<Integer,Integer,Integer> f1 =(e1,e2)->
        {
            if(e2>0) return e1/e2; return e1;
        };
        BinaryOperator<Integer> f2= (e1,e2)-> e1+e2;
        BinaryOperator<Integer> f3 = BinaryOperator.maxBy(Comparator.reverseOrder());
        System.out.println(transform(5,6,f1, g ->++g));
        System.out.println(transform(5,6,f2));
        System.out.println(transform(5,6,f3));
        System.out.println(transform(5,6,Transformat::func));
    }
}
