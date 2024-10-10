package functionalinterfaces;

import java.util.Comparator;
import java.util.function.*;

public class PredefinedFunctionalInterface {
    public static void main(String[] args) {
        //predicate
        Predicate<Integer> isEven= (x)->x%2==0;
        System.out.println(isEven.test(4));
        //function - apply

        Function<String,Integer>stringLength=(s)->s.length();
        System.out.println(stringLength.apply("Revanth"));

        //consumer

        Consumer<String>str=(s)-> System.out.println(s);
        str.accept("Revanth");

        //Supplier

        Supplier<String>supplier=()->"Hello Revanth";
        System.out.println(supplier.get());

        //BiFunction

        BiFunction<Integer,Integer,Integer>bifunc=(x,y)->x+y;
        System.out.println(bifunc.apply(2,4));

        //BiConsumer

        BiConsumer<String,Integer>biConsumer=(name,age)-> System.out.println(name+" "+age);
        biConsumer.accept("Revanth",21);

        //UnaryOperator

        UnaryOperator<Integer>square=(x)->x*x;
        System.out.println(square.apply(4));

        //BinaryOperator

        BinaryOperator<Integer>mul=(a,y)->a*y;
        System.out.println(mul.apply(4,5));

        //Comparator

        Comparator<Integer>comp=(a,b)->a-b;
        System.out.println(comp.compare(4,2));





















        //Home Taskkkkkkkkk

        Predicate<Integer>isOdd=(x)->x%2==0;

        System.out.println(isOdd.test(24));

        Function<Integer,Integer>func=(x)->x+4;
        System.out.println(func.apply(16));

        BiFunction<String,Integer,Boolean> func1=(x,y)->x.length()==y;
        System.out.println(func1.apply("Revanth",7));

        Consumer<String> concumer=(x)->System.out.println(x);
        concumer.accept("I am a Consumer");

        BiConsumer<String, Integer> biconsumer=(x,y)->System.out.println("I am "+x+" of age "+y);
        biconsumer.accept("Revanth",21);

        Supplier<Integer> supplier1=()->45;
        System.out.println( supplier1.get());

        UnaryOperator<Integer> uopp= (x)->x*x*x;
        System.out.println(uopp.apply(8));

        BinaryOperator<Integer> biopp=(x,y)->x*x*x*y*y;
        System.out.println(biopp.apply(6,4));

        CustomInterface<Integer,Integer,Integer>custom=(x,y)->x+y;
        System.out.println(custom.add(2,4));

    }
}
