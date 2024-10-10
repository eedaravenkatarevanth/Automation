package enums;

public class WraperExample{
    public static void main(String[] args) {
        int a = 10;
        Integer Wrapper=a;//Autoboxing
        System.out.println(Wrapper);
        Integer b = 20;
        int Unbox= b;//unboxing
        System.out.println(Unbox);

        Integer Unbox1= Integer.valueOf((int) 100.00);
        System.out.println(Unbox1);
        String value= Integer.toString(50);
        System.out.println(value);
        System.out.println(Integer.valueOf("12ABCD"));
                
    }
}
