package enums;

public class Days {
    public enum DAYS{
        Monday,
        Tuesday,
        Wednessday,
        Thursday,
        Friday,
        Saturday,
        Sunday
    }
}
class ExampleUsage{
    public static void main(String[] args) {
        Days.DAYS day= Days.DAYS.Monday;
        switch(day){
            case Monday:
                System.out.println("Monday");
                break;
            case Tuesday:
                System.out.println("Tuesday");
                break;
            default:
                System.out.println("No Work");
                break;
        }
    }

}

