package my.practice.oops.patterns.creational.abstractfactory;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author prince arora
 */
public class AbstractFactoryPatterTest {

    private VehicleFactory fourWellerFactory;

    private VehicleFactory twoWellerFactory;

    @Before
    public void setUp() {
        this.twoWellerFactory = Producer.getFactory(VehicleType.TWO_WELLER);
        this.fourWellerFactory = Producer.getFactory(VehicleType.FOUR_WELLER);
    }

    @Test
    public void testTwoWellerFactory() {
        Vehicle vehicle = this.twoWellerFactory.produceVehicle();
        Assert.assertEquals(
                this.getTestVehicleObject(VehicleType.TWO_WELLER).getType(),
                vehicle.getType()
        );
    }

    @Test
    public void testFourWellerFactory() {
        Vehicle vehicle = this.fourWellerFactory.produceVehicle();
        Assert.assertEquals(
                this.getTestVehicleObject(VehicleType.FOUR_WELLER).getType(),
                vehicle.getType()
        );
    }

    private Vehicle getTestVehicleObject(VehicleType vehicleType) {
        Vehicle vehicle = new Vehicle();
        switch (vehicleType) {
            case TWO_WELLER:
                vehicle.setType(VehicleType.TWO_WELLER);
                break;
            case FOUR_WELLER:
                vehicle.setType(VehicleType.FOUR_WELLER);
        }
        return vehicle;
    }
}
