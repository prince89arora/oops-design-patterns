package my.practice.oops.patterns.creational.prototype;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * @author prince arora
 */
public class PrototypeProvider {

    private static Map<Flavor, IceCream> MAP = new HashMap<>();

    private static IceCreamFactory FACTORY = new IceCreamFactory();

    static {
        for (Flavor flavor : Flavor.values()) {
            MAP.put(
                    flavor,
                    FACTORY.produceOneKg(flavor)
            );
        }
    }

    public IceCream getPrototype(Flavor flavor) throws CloneNotSupportedException {
        IceCream iceCream = MAP.get(flavor);
        System.out.println(iceCream);
        return (Objects.isNull(iceCream) ? null : (IceCream) iceCream.clone());
    }
}
