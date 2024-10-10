package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Setss {
    public static void main(String[] args) {
        Set<Integer>number= new HashSet<>();
        number.add(12);
        number.add(21);
        number.add(22);
        System.out.println(number);

        number.remove(21);
        System.out.println(number);

        //displaying
        Iterator it= number.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        
        Set<Integer>set2=new HashSet<>();
        set2.add(12);
        set2.add(45);
        set2.add(7);

        number.addAll(set2);
        System.out.println(number);


    }


}
