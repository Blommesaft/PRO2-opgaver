package Opgave03;

public class Person {

    private String name;
    public Person next; // Reference til næste person i cirklen

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}
