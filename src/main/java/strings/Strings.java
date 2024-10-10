package strings;

import java.io.IOException;
import java.util.Locale;
import java.util.*;
public class Strings {
    public static void main(String[] args) {

        // How to declare a string

        String s1= new String("Revanth"); // this will create a new reference

        s1="revanth hi how are you" ; // changes the value of s1
        String s = new String("revvanth");
        String s2="revanth";
        s1= s1.replace("rev","revv"); // replaces a particular value with other value
        String[] spl= s1.split("//s+");
        System.out.println(s1.charAt(1));

        System.out.println(s1.equals(s1));

        System.out.println(s1.toUpperCase());

        System.out.println(s1.concat(" eedara"));

        System.out.println(s1.compareTo(s));

        System.out.println(s1.codePointAt(2));

        System.out.println(s1.codePointCount(0,7));

        System.out.println(s1.contains("vvv"));

        System.out.println(s1.repeat(3));


        String[] pra={"abc","def","ghi"};
        System.out.println(pra[0].charAt(0));


        String string1= new String("epam");
        String string2= new String("epam");
        System.out.println(string1.equals(string2));



    }
}
