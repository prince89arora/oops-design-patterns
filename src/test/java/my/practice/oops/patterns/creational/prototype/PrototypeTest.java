package my.practice.oops.patterns.creational.prototype;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author prince arora
 */
public class PrototypeTest {

    private PrototypeProvider prototypeProvider;

    @Before
    public void setUp() throws Exception {
        this.prototypeProvider = new PrototypeProvider();
    }

    @Test
    public void prototypeChocolate_Test() throws CloneNotSupportedException {
        IceCream iceCream = this.prototypeProvider.getPrototype(Flavor.CHOCOLATE);
        Assert.assertEquals(
                iceCream.getFlavor(),
                Flavor.CHOCOLATE
        );
    }

    @Test
    public void prototypeVanilla_Test() throws CloneNotSupportedException {
        IceCream iceCream = this.prototypeProvider.getPrototype(Flavor.VANILLA);
        Assert.assertEquals(
                iceCream.getFlavor(),
                Flavor.VANILLA
        );
    }

    @Test
    public void prototypeMix_Test() throws CloneNotSupportedException {
        IceCream iceCream = this.prototypeProvider.getPrototype(Flavor.MIX);
        Assert.assertEquals(
                iceCream.getFlavor(),
                Flavor.MIX
        );
    }
}
