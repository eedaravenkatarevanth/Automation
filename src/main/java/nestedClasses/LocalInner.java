package nestedClasses;

public class LocalInner {
    private int a=45;
    void display(){
        class Inner{

            void msg(){
                System.out.println(a);
            }

        }
        Inner i= new Inner();
        i.msg();
    }

    public static void main(String[] args){
        LocalInner il= new LocalInner();
        il.display();
    }

}
