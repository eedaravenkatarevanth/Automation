package lambda;

import java.lang.reflect.Array;
import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class HomeTask {
    static void checkRotation(){
        String str1="Revanth";
        String str2="evRanth";
        Set<Character>set1= new LinkedHashSet<>();
        Set<Character>set2= new LinkedHashSet<>();
        for(int i=0;i<str1.length();i++){
            set1.add(str1.charAt(i));
            set2.add(str2.charAt(i));

        }
        if(set1.equals(set2)) System.out.println("it is a rotation"+ set1+set2);
        else System.out.println("it is not a rotation"+ set2+set1);
    }

    static void checkSecondGreatest(List list){
        List<Integer>lis= new ArrayList<>(list);
        int max=0;
        Integer num= lis.stream()
                .sorted((a,b)->b-a)
                .skip(1)
                .findFirst()
                .orElse(null);
        System.out.println(num);

    }

    static void checkPallindrome(){
        String str="momom";
        Predicate<String> isPallindrome=s->{
            String reversed=new  StringBuilder(s).reverse().toString();
            return reversed.equals(str.toString());
        };

        if(isPallindrome.test(str)){
            System.out.println("it is a pallindrome");
        }
        else{
            System.out.println("not a pallindrome");
        }
    }
    public static void main(String[] args) {
        checkPallindrome();
        List<Integer> list= Arrays.asList(1,3,4,2,5,6,9);
        checkSecondGreatest(list);
        checkRotation();
        Set<Integer>set= new HashSet(Arrays.asList(1,2,3,6,5,9,0,8));
        List <Integer> listw=set.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(listw);
    }

}
