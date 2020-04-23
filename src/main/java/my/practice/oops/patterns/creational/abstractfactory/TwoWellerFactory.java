package my.practice.oops.patterns.creational.abstractfactory;

/**
 * @author prince arora
 */
class TwoWellerFactory extends VehicleFactory {

    @Override
    public Vehicle produceVehicle() {
        Vehicle vehicle = new Vehicle();
        vehicle.setType(VehicleType.TWO_WELLER);
        return vehicle;
    }
}
