package InterfacesDemo.Entities;

import InterfacesDemo.Services.Flyable;

// subclass of animal ( bird is an animal)
public class Birds extends Animal implements Flyable {

    public Birds(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println("Bird " + getName() + " flies.");
    }

    @Override
    public void land() {
        System.out.println("Bird " + getName() + " lands.");
    }
}
