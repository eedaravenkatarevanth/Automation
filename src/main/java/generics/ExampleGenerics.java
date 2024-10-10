package generics;

import java.util.Arrays;

class Dynamic_Array <T>{
    T[] array;
    int i;
    @SuppressWarnings("unchecked")
    public Dynamic_Array(){
        this.array= (T[]) new Object[10];
        this.i=0;
    }

    void insert(T obj){
        array[i]=obj;
        this.i+=1;
    }
    void display(){
        System.out.println(Arrays.toString(array));
    }

}
public class ExampleGenerics {
    public static void main(String[] args) {
        Dynamic_Array<Integer> obj = new Dynamic_Array<>();
        obj.insert(1);
        obj.insert(2);
        obj.display();
        Dynamic_Array<String> obj2= new Dynamic_Array<>();
        obj2.insert("revanth");
        obj2.insert("Kosuru");
        obj2.display();
    }
}
