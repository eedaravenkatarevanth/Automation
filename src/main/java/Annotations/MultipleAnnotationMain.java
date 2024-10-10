package Annotations;

public class MultipleAnnotationMain {
    @MultipleAnnotation(value = "My name is revanth and iam ", number = 21)
    void Method(){
        System.out.println("i am inside");
    }
    public static void main(String[] args) throws NoSuchMethodException {
        MultipleAnnotationMain m= new MultipleAnnotationMain();
        m.Method();
        MultipleAnnotation main=  MultipleAnnotationMain.class.getDeclaredMethod("Method").getAnnotation(MultipleAnnotation.class);
        if(main!= null){
            System.out.println(main.value());
        }
    }
}
