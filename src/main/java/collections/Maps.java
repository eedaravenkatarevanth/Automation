package collections;

import java.util.*;

public class Maps {
    public static void main(String[] args) {
        Map<Integer,String> mp= new HashMap<>();
        Map<Integer,String> lmp= new LinkedHashMap<>();
        Map<Integer,String> tmp= new TreeMap<>();
        Map<Integer,String> hmp= new Hashtable<>();
        mp.put(1,"Revanth");
        mp.put(2,"bhuvan");
        mp.put(3,"sahith");
        for(Map.Entry<Integer,String> entry:mp.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }

        for(Integer key : mp.keySet()){
            System.out.println(key);
        }

        for(String values: mp.values()){
            System.out.println(values);
        }


        Hashtable<Integer,String>ht= new Hashtable<>();
        ht.put(1,"Revanth");
        ht.put(2,"sachin");
        ht.put(3,"sahith");

        for(Map.Entry<Integer,String> entry:ht.entrySet()){
            System.out.println(entry.getKey()+ " "+entry.getValue());
        }
        System.out.println(ht);
    }
}
