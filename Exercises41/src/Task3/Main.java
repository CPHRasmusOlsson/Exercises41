package Task3;

public class Main {
    public static void main(String[] args) {
    Zoo zoo = new Zoo();
    Dog dog = new Dog(4);
    Cat cat = new Cat(4);
    Spider spider = new Spider(8);
    zoo.addAnimal(dog);
    zoo.addAnimal(cat);
    zoo.addAnimal(spider);

    zoo.makeAllSounds();
    zoo.printNumberOfLegs();



    }
}
