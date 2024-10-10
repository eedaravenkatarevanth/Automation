package restassured;

public class Student {
    private int id;
    private String name;
    private int age;

    // No-argument constructor (needed for Jackson)
    public Student() {
    }

    // Constructor with parameters
    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    // Getters (needed for Jackson)
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
