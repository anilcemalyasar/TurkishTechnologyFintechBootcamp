package Section1;

public class Vehicle {
    int passengers;     // number of passengers
    int fuelCapacity;   // fuel capacity in gallons
    int milesPerGallon; // fuel consumption in miles per gallon

    // Constructor to initialize values to class variables (this is a reference to the invoking object)

    public Vehicle(int passengers, int fuelCapacity, int milesPerGallon) {
        this.passengers = passengers;
        this.fuelCapacity = fuelCapacity;
        this.milesPerGallon = milesPerGallon;
    }


    // methods

    // Calculate range of vehicle based on fuelcap and mpl values
    int calculateRange() {
        return fuelCapacity * milesPerGallon;
    }

    // Compute fuel needed for a given distance
    double fuelNeeded(int miles) {
        return (double) miles / milesPerGallon;
    }

}