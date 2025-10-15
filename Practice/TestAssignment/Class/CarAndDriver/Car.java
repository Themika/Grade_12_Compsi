package CarAndDriver;

public class Car {
    private String model;
    private String make;
    private int fuelLevel;

    public Car(String model, String make, int fuelLevel) {
        this.model = model;
        this.make = make;
        this.fuelLevel = fuelLevel;
    }

    public String getModel() {
        if(model == null || model.isEmpty()) {
            model = "Unknown";
        }
        return model;
    }
    public String getMake() {
        if(make == null || make.isEmpty()) {
            make = "Unknown";
        }
        return make;
    }
    public int getFuelLevel(){
        return fuelLevel;
    }
    public void drive(int distance){
        System.out.println("Driving " + distance + " miles.");
        int fuelUsed = distance / 10;
        fuelLevel -= fuelUsed;
        if(fuelLevel < 0){
            System.out.print( "Out fo fuel");
            fuelLevel = 0;
        }
    }
    public void refuel(int amount){
        fuelLevel += amount;
        if(fuelLevel > 100){
            fuelLevel = 100;
        }
    }
    
}
