package junit;

public class Restriction {
    public String validate(int age,String name){
        String result="invalid";
        if(name==null){
            throw new IllegalArgumentException("name should not be null");
        }
        if(age>17 && age<60){
            System.out.println("valid age");
            result="valid";
        }
        else if(age>59){
            System.out.println("senior citezen unvalid vote");

        }
        else{
            System.out.println("age is less than 18 come back when you are 18+");

        }
        return result;
    }

}
