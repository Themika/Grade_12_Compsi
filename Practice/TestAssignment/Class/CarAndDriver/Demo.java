package CarAndDriver;

public class Demo {
    public static void main(String[] args) {
        Car car = new Car("Model S", "Tesla", 50);
        Driver driver = new Driver("John Doe", "Model S");
        
        System.out.println("Driver Name: " + driver.getName());
        System.out.println("Car Model: " + driver.getCar());
        System.out.println("Initial Fuel Level: " + car.getFuelLevel() + "%");
        
        driver.takeTrip(car, 200, 30); // Attempt to drive 200 miles and refuel with 30 if needed
        
        System.out.println("Fuel Level after trip: " + car.getFuelLevel() + "%");
    }
}
