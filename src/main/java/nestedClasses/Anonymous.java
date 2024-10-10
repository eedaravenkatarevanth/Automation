package nestedClasses;

abstract class Anonymous {
    abstract void display();
}
class Test{
    public static void main(String[] args){
        Anonymous any= new Anonymous(){
            void display(){
                System.out.println("Hello World");
            }
        };
    }
}

