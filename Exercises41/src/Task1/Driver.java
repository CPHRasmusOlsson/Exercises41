package Task1;

public class Driver {
    private final int age;
    private final String name;

    public Driver(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "is driven by "+this.name+" age "+this.age;
    }
}
