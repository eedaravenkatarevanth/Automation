package collections;


class MemberInnerClass
{
    private int value =10;

    public void shout()
    {
        int value1=12;
        System.out.println("Heyyyyy");
        class LocalInner
        {
            void print(){
                System.out.println("I am Inside local Inner "+value*2);}
        }
        value1=5;
        LocalInner li= new LocalInner();
        li.print();
        Inner in= new Inner();
        in.shou();
    }

    class Inner
    {
        public void shou()
        {
            System.out.println("heyyyyyyy"+ value*2);
        }
    }

}

public class HelloWorld {

    public static void main(String[] args) {
        MemberInnerClass m = new MemberInnerClass();
        m.shout();
    }

}