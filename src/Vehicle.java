public abstract class Vehicle {
    private final String plate;
    Vehicle(String plate){
        this.plate = plate;
    }
    public abstract VehicleSize getSize();
}
