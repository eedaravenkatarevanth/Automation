package restapi;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

public class Example {
    public static void main(String[] args) {
        List<User> user= new ArrayList<>();
        user.add(new User("Revanth",21,"revanth451"));
        user.add(new User("kosuru",21,"kosuru31"));

        Gson gson= new Gson();
        String str= gson.toJson(user);
        System.out.println(str);

//        String str1= gson.fromJson();
    }

}
