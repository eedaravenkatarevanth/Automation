package exceptionhandling;

class ExceptionNormal{
    static void display(){
        System.out.println(10/0);
    }
}

class ExceptionBlock{
    static void display(){
        try{
            System.out.println(10/0);
            System.out.println("Lines after the exception"); //this will not execute
        }catch(ArithmeticException ae){
            System.out.println("you haven't followed arthemetic prop");
        }finally{
            System.out.println("Lines in final block");
        }
    }
}

class ExceptionNested{
    static void display(){
        try{
            try{
                System.out.println(10/0);
            }catch(ArrayIndexOutOfBoundsException e){
                System.out.println("ArrayIndexOutOfBoundsException");
            }
            finally {
                System.out.println("Finally");
            }
        }catch(ArithmeticException ae){
            System.out.println("you haven't followed arthemetic prop");
        }
    }

}


class Multiplecatch{
    static void display(){
        try{
            int[] arr= {1,2,3,4,5};
            System.out.println(arr[2]);
            System.out.println(10/0);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException");

        }
        catch(ArithmeticException ae){
            System.out.println("you haven't followed arthemetic prop");
        }
    }
}

class Multicatch{
    static void display(){
        try{
            System.out.println(10/0);
        }
        catch(NullPointerException  | ArithmeticException| ArrayIndexOutOfBoundsException e){
            System.out.println("Exception Bro check ur code");
        }
    }
}



public class Exceptions {
    public static void main(String[] args) {
        Multicatch.display();
    }
}
