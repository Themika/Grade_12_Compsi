package CarAndDriver;

public class Driver {
	private String name;
    private String car;
    
    public Driver(String name, String car) {
        this.name = name;
        this.car = car;
    }

    public String getName() {
        if(name == null || name.isEmpty()) {
            name = "Unknown";
        }
        return name;
    }

    public String getCar() {
        if(car == null || car.isEmpty()) {
            car = "Unknown";
        }
        return car;
    }

    public void takeTrip(Car car, int distance, int fuel){
        car.drive(distance);
        if (car.getFuelLevel() < 0){
            System.out.println("Not enough fuel to complete the trip. Refueling...");
            car.refuel(fuel);
        }
    }
}
