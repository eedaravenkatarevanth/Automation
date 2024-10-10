package generics;

import java.util.*;
import java.util.List;
// upperbound
public class Wildcards {
    public static void main(String[] args) {

        List<Integer>list= Arrays.asList(1,2,3,4,5);
        List<Double>list2=Arrays.asList(1.3,1.4,1.5);
        System.out.println(calculate(list));
        System.out.println(calculate(list2));

        //lowerbound
        List<Number>numbers=new ArrayList<>();
        addNumbers(numbers);
        System.out.println(numbers);
    }
    //upperbound
    static double calculate(List<? extends Number>list){
        double sum=0.0;
        for(Number number:list){
            sum+=number.doubleValue();
        }
        return sum;
    }

    static void addNumbers(List<? super Integer>list){
        list.add(22);
        list.add(33);
        list.add(44);
    }


}
