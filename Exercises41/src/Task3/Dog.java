package Task3;

public class Dog extends Animal {

    public Dog(int numberOfLegs) {
        super(numberOfLegs);
    }

    @Override
    public void makeSound(){
        System.out.println("WOOF WOOF!");
    }
}
