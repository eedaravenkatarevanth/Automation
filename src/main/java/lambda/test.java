package lambda;
import java.util.*;
class main{
    public static void main(String[] args){
        int[] arr={114,101,118,97,110,116,104,31,105,115,31,103,114,101,97,116};
        List<Character>lei=Arrays.stream(arr).mapToObj(x->(char)(x)).toList();
        lei.forEach(System.out::print);
    }
}