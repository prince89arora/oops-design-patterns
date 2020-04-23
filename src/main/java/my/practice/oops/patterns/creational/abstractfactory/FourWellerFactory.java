package my.practice.oops.patterns.creational.abstractfactory;

/**
 * @author prince arora
 */
class FourWellerFactory extends VehicleFactory {

    @Override
    public Vehicle produceVehicle() {
        Vehicle vehicle = new Vehicle();
        vehicle.setType(VehicleType.FOUR_WELLER);
        return vehicle;
    }
}
