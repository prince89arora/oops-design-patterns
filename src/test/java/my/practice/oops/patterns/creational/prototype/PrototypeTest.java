package my.practice.oops.patterns.creational.prototype;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author prince arora
 */
public class PrototypeTest {

    @Test
    public void prototypeChocolate_Test() throws CloneNotSupportedException {
        PrototypeProvider provider = new PrototypeProvider();
        IceCream iceCream = provider.getPrototype(Flavor.CHOCOLATE);
        Assert.assertEquals(
                iceCream.getFlavor(),
                Flavor.CHOCOLATE
        );
    }

    @Test
    public void prototypeVanilla_Test() throws CloneNotSupportedException {
        PrototypeProvider provider = new PrototypeProvider();
        IceCream iceCream = provider.getPrototype(Flavor.VANILLA);
        Assert.assertEquals(
                iceCream.getFlavor(),
                Flavor.VANILLA
        );
    }

    @Test
    public void prototypeMix_Test() throws CloneNotSupportedException {
        PrototypeProvider provider = new PrototypeProvider();
        IceCream iceCream = provider.getPrototype(Flavor.MIX);
        Assert.assertEquals(
                iceCream.getFlavor(),
                Flavor.MIX
        );
    }
}
