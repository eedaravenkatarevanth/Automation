package Record;

public class Example {
    public static void main(String[] args) {

        Person person = new Person("Revanth", 21);
        System.out.println("Name: " + person.name());
        System.out.println("Age: " + person.age());
        System.out.println("Person Details: " + person);
        Person another = new Person("KOsuru", 22);
        System.out.println("Are both persons equal? " + person.equals(another));
    }
}
record Person(String name, int age) {
}

