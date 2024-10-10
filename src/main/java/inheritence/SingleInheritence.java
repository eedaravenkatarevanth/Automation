package inheritence;

public class SingleInheritence {
    public String name;
    public int age;
    public void collage(){
        System.out.println("we are from srm");
    }
}

class Engineering extends SingleInheritence{
    public void setName(String s, int ag){
        name=s;
        age=ag;
    }
    public void display(){
        System.out.println("Name: "+name+" Age : "+age);
    }
}


class Main{
    public static void main(String[] args){
        Engineering e= new Engineering();
        e.setName("revanth",20);

        Engineering e1= new Engineering();
        e.display();
        e1.setName("kosuru", 21);
        e1.display();
    }
}