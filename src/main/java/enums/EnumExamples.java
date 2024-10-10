package enums;

import java.util.Arrays;

enum Direction{
    NORTH, EAST, SOUTH, WEST
}
public class EnumExamples {
    public static void main(String[] args) {
        Direction direction =Direction.NORTH;
        for(Direction d: Direction.values()){
            System.out.println(d);
        }
        //autoboxing
        int a=10;
        Integer wraped= a;
        System.out.println(wraped);
        //unboxing
        Integer ex= 10;
        int ex_e= ex;
        System.out.println(ex_e);
    }
}


//
//package generics;
//
//import java.util.Arrays;
//
//class Generics<T>{
//    T[] array;
//    int a1;
//    int a2;
//    public Generics(T[] array, int a1, int a2){
//        this.array=array;
//        this.a1=a1;
//        this.a2=a2;
//    }
//    public void swap(){
//        T temp= this.array[this.a1];
//        this.array[this.a1]=this.array[this.a2];
//        this.array[this.a2]=temp;
//    }
//    public String display(){
//        return Arrays.toString(array);
//    }
//
//}
//
//
//public class GenericMethod {
//    Integer[] intArray= {1,2,3,4,5};
//    String[] Array= {"revanth","kosuru","sai","satya"};
//
//    generics.Generics<Integer> obj= new generics.Generics<>(intArray,1,2);
//    generics.Generics<String> obj2= new generics.Generics<>(Array,1,2);
//    obj2.swap();
//
//}

