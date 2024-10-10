package junit;

public class Calculator {
    public Double divide(double a, double b)
    {
            if(b==0) throw new ArithmeticException("division by zero");
            return a / b;

    }

    public int Multiply(int a, int b){
        return a*b;
    }

    public int add(int a, int b){
        return  a+b;
    }

    public int subtract( int a, int b){
        return a-b;
    }
}

