package polymorphisim;
import java.util.*;
public class MethodOverloading {
    public int add( int a, int b){
        return a+b;
    }
}

class Subclass extends MethodOverloading{
    public int add(int a, int b){
        return a-b;
    }
}

class Main{
    public static void main(String[] args){
        Subclass obj= new Subclass();
        System.out.println(obj.add(1,2));

    }
}
