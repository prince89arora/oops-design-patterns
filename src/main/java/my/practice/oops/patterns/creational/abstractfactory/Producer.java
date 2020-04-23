package my.practice.oops.patterns.creational.abstractfactory;

/**
 * @author prince arora
 */
public class Producer {

    public static VehicleFactory getFactory(VehicleType vehicleType) {
        VehicleFactory vehicleFactory = null;
        switch (vehicleType) {
            case FOUR_WELLER:
                vehicleFactory = new FourWellerFactory();
                break;
            case TWO_WELLER:
                vehicleFactory = new TwoWellerFactory();
                break;
        }

        return vehicleFactory;
    }
}
