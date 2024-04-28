package InterfacesDemo.Entities;

import InterfacesDemo.Services.Flyable;

public class Bat extends Mamals implements Flyable {
    public Bat(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println("Bat " + getName() + " flies.");
    }

    @Override
    public void land() {
        System.out.println("Bat " + getName() + " lands.");
    }
}
