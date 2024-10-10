package interfaces;

public class Practice {
    public void call(){
        int i=5;
        System.out.println("inside the base class"+ i);
    }
}

class Interfaces extends Practice implements Call{
    public void call(){
        System.out.println("printing the method of the inheritence "+NUM);
        super.call();
        print("         ");
        System.out.println(Call.isNull("revanth"));
    }


}

class Main{
    public static void main(String[] args){
        Practice obj= new Interfaces();
        obj.call();
    }
}


