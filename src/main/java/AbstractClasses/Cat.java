package AbstractClasses;

public class Cat extends Animal implements AnimalStuff{
    public  String sound(String s){
        name= s;
        return "Sound cat makes is"+name;
    }

    public String animalType(){
        return "the animal type is "+AnimalStuff.type;
    }

}
