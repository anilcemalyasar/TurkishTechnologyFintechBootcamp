package Section1;
public class VehicleDemo {

    public static void main(String[] args) {
        // construct complete vehicles
        Vehicle minivan = new Vehicle(7, 16, 21);
        Vehicle sportscar = new Vehicle(2, 14, 12);

        double gallons;
        int distance = 252;

        int range1, range2;

        /*
        // assign values to fields in minivan
        minivan.passengers = 7;
        minivan.fuelCapacity = 16;
        minivan.milesPerGallon = 21;

        // assign values to fields in sportscar
        sportscar.passengers = 2;
        sportscar.fuelCapacity = 14;
        sportscar.milesPerGallon = 12;
         */

        // calculate range of minivan and sportscar based on fuelcap and mpg
//        range1 = minivan.fuelCapacity * minivan.milesPerGallon;
//        range2 = sportscar.fuelCapacity * sportscar.milesPerGallon;
        range1 = minivan.calculateRange();
        range2 = sportscar.calculateRange();

        // Fuel needed for minivan
        gallons = minivan.fuelNeeded(distance);
        System.out.println("To go " + distance + " miles minivan needs " + gallons + " gallons fuel");

        // Fuel needed for sportscar
        gallons = sportscar.fuelNeeded(distance);
        System.out.println("To go " + distance + " miles sportscar needs " + gallons + " gallons fuel");

        System.out.println("Minivan car carry " + minivan.passengers + " passengers with a range of " + range1);
        System.out.println("Sportscar car carry " + sportscar.passengers + " passengers with a range of " + range2);

    }

}
