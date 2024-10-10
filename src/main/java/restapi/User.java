package restapi;

public class User {
    private String name;
    private int Age;
    private String userName;
    public User(String name,int age,String user1){
        this.name=name;
        this.Age=age;
        this.userName=user1;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return Age;
    }


    public String getUserName() {
        return userName;
    }
}
