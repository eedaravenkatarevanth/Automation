package AbstractClasses;

public class Main {
    public static void main(String[] args){
        Cat c= new Cat();
        String result=c.sound("meow");
        System.out.println(result);
        System.out.println(c.animalType());

    }
}
