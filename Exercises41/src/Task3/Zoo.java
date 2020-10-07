package Task3;

import Task2.Room;

import java.util.ArrayList;

public class Zoo {
    ArrayList<Animal> animals = new ArrayList<>();

    void addAnimal(Animal animal){
        animals.add(animal);
    }


    void makeAllSounds(){
        for(Animal animal : animals){
            animal.makeSound();
        }
    }

    void printNumberOfLegs(){
        int totalLegs = 0;
        for (Animal animal : animals) {
            totalLegs += animal.getNumberOfLegs();
        }
        System.out.println("Total number of legs in my zoo: " + totalLegs);
    }

}
