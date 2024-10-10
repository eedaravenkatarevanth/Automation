package nestedClasses;

public class StaticNestedClass
{

    public static int a =10;

    static class InnerClass
    {

        void msg()
        {
            System.out.println(a);
        }
    }

    public static void main(String[] args)
    {
        StaticNestedClass.InnerClass i = new StaticNestedClass.InnerClass();
        i.msg();
    }

}
