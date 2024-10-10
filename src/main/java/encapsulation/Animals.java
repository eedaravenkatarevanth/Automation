package encapsulation;

public class Animals {
    private String sound;
    private static int counter;
    public  String getSound(){
        return sound;
    }
    public void SetSound(String s){
        sound=s;
    }
    public Animals(){
        counter++;
    }
    public static void printCounter(){
        System.out.println(counter);
    }
}

class Main{
    public static void main(String[] args){
        Animals elephant= new Animals();
        elephant.SetSound("roar");
        System.out.println(elephant.getSound());

        Animals cat = new Animals();
        cat.SetSound("meow");
        System.out.println(elephant.getSound());

        Animals.printCounter();
    }
}
