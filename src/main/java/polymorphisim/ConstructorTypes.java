package polymorphisim;

public class ConstructorTypes {
    private String name;
    public int  age;
    static public int real_age;
    public ConstructorTypes(){
        this.name="revanth";
        this.age=21;
        ConstructorTypes s= new ConstructorTypes(21);
    }
    private ConstructorTypes(int ade){
        age=ade +12;
        real_age=age;
        System.out.println("inside the constructor");
    }
    public  int getAge(){
        return real_age;
    }

}

class Constructor{
    public static void main(String[] args){
        ConstructorTypes obj= new ConstructorTypes();
        System.out.println(obj.age);
        System.out.println(obj.getAge());
    }
}
