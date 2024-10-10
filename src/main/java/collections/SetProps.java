package collections;

import java.util.*;

public class SetProps {
    public static void main(String[] args) {
        Set<String> set= new LinkedHashSet<String>();
        Set<String> treeset= new TreeSet<>();
        Set<String> linked = new LinkedHashSet<>();

        set.add("Revanth");
        set.add("kosuru");
        set.add("Bhuvan");
        set.add("gopinadh");

        treeset.addAll(set);
        treeset.remove("gopinadh");
        System.out.println(treeset);

        linked.addAll(set);
        System.out.println(linked);



        //conerting a list to a set

        List<String> list= new ArrayList<>();
        list.add("Revanth");
        list.add("kosuru");
        list.add("Bhuvan");
        list.add("satya");
        list.add("Revanth");

        System.out.println(list);

        Set<String> set1= new HashSet<>(list);
        System.out.println(set1);



//        System.out.println(set);
    }
}
