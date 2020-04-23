package my.practice.oops.patterns.creational.abstractfactory;

/**
 * @author prince arora
 */
public class Vehicle {

    private String make;
    private String model;
    private VehicleType type;

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public VehicleType getType() {
        return type;
    }

    public void setType(VehicleType type) {
        this.type = type;
    }
}
