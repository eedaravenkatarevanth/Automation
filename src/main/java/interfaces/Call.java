package interfaces;

public interface Call{
    void call();
    int NUM =10;
    default void print(String str){
        if(!isNull(str)){
            System.out.println("data print lines " + str);
        }
        else System.out.println("it is empty");
    }
    static boolean isNull(String str){
        return str==null ? true: "".equals(str.trim()) ?true:false;
    }
}
