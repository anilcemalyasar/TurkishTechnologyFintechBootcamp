package ToysDemo;

import InterfacesDemo.Services.Flyable;

public class Plane extends Toy implements Flyable {

    public Plane(String name, double price) {
        super(name, price);
    }

    @Override
    public void fly() {
        System.out.println("Plane " + getName() + " flies.");
    }

    @Override
    public void land() {
        System.out.println("Plane " + getName() + " lands.");
    }
}
