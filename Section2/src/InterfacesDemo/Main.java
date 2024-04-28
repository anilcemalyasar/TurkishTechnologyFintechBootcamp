package InterfacesDemo;

import InterfacesDemo.Entities.Bat;
import InterfacesDemo.Entities.Birds;
import InterfacesDemo.Entities.Pigeon;
import InterfacesDemo.Services.Flyable;

public class Main {

    private static void makeFly(Flyable flyable) {
        System.out.println();
        System.out.println("Fly!");
        flyable.fly();
        System.out.println("Land!");
        flyable.land();
    }
    public static void main(String[] args) {
        Pigeon pigeon = new Pigeon("Tumbler");
        pigeon.fly();
        pigeon.land();

        // An abstract super class can hold the reference its inherited classes
        Birds bird = new Pigeon("Booted");
        bird.fly();
        bird.land();

        // An interface can hold the reference of its implemented classes
        Flyable flyable = new Pigeon("Postaci");
        flyable.fly();
        flyable.land();

        Bat bat = new Bat("The Dark Knight");
        makeFly(bat);

    }
}

