import driver.Driver;
import driver.DriverLicenseException;
import transport.Bus;
import transport.Car;
import transport.Trucks;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws NullPointerException, DriverLicenseException {
        Car c1 = new Car("Lada", "Vesta", 1.7, Car.BodyType.SEDAN);
        Car c2 = new Car("Audi", "A8", 3.0, Car.BodyType.UNIVERSAL);
        Car c3 = new Car("Mazda", "RX8", 2.5, Car.BodyType.HATCHBACK);
        Car c4 = new Car("VW", "Polo Sedan", 1.6, Car.BodyType.MINIVAN);

        Trucks t1 = new Trucks("Volvo", "FH12", 13.0, Trucks.LoadCapacity.N1);
        Trucks t2 = new Trucks("Scania", "FH12", 14.5, Trucks.LoadCapacity.N2);
        Trucks t3 = new Trucks("KAMAZ", "FH12", 15.0, Trucks.LoadCapacity.N3);
        Trucks t4 = new Trucks("MercedesBenz", "Actos", 16.5, Trucks.LoadCapacity.N1);

        Bus b1 = new Bus("MAZ", "203", 10.0, Bus.TypeOfCapacity.BIG);
        Bus b2 = new Bus("MAZ", "205", 11.5, Bus.TypeOfCapacity.AVERAGE);
        Bus b3 = new Bus("MAZ", "206", 12, Bus.TypeOfCapacity.ESPECIALLY_BIG);
        Bus MAZ4 = new Bus("MAZ", "207", 12.5, Bus.TypeOfCapacity.ESPECIALLY_SMALL);
    }
}
