package patternsP.prototype.model;

public class Human implements Copyable{
    private int age;
    private String name;

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
    }
    @Override
    public Object copy() {
        return new Human(this.age, this.name);
    }

    @Override
    public String toString() {
        return "Human{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}