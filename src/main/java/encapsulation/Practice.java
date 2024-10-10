package encapsulation;
import java.util.*;
import java.lang.*;
public class Practice {
    public static void main(String[] args){
       int[] array= {21,12,34,45};
       int[] hold= {49,48,36,34,32,33,22,11,23,45,56};
       System.arraycopy(array,1,hold,2,array.length-1 );
        System.out.println(Arrays.toString(hold));

    }
}
