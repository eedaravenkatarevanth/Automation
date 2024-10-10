package Annotations;

public class SingleValueAnnotation {
    @SingleAnnotation("hey this is a single value annotation")
    public void Method(){
        System.out.println("i am in the method ");
    }
    public static void main(String[] args) throws NoSuchMethodException {
        SingleValueAnnotation annotation= new SingleValueAnnotation();
        annotation.Method();
        SingleAnnotation a= SingleValueAnnotation.class.getDeclaredMethod("Method").getDeclaredAnnotation(SingleAnnotation.class);
        if(a.value()!= null){
            System.out.println(a.value());
        }

    }
}
