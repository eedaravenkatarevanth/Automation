package nestedClasses;

public class MemberInner {
    private int a=12;

    public class Inner{
        void display(){
            System.out.println(a);
        }
    }

    void display1(){
        System.out.println("method outside the inner class");
    }

    public static void main(String[] args){
        MemberInner obj = new MemberInner();
        MemberInner.Inner in= obj. new Inner();
        in.display();

        obj.display1();
    }
}

class Biriyani extends MemberInner{
    public static void main(String[] args){
        MemberInner obj= new MemberInner();
        MemberInner.Inner in= obj.new Inner();
        in.display();
        obj.display1();
    }
}
