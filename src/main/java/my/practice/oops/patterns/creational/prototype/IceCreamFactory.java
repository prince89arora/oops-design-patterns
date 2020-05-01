package my.practice.oops.patterns.creational.prototype;

/**
 * @author prince arora
 */
public class IceCreamFactory {

    public IceCream produceOneKg(Flavor flavor) {
        IceCream iceCream = null;
        switch (flavor) {
            case MIX:
                iceCream = new MixIceCream(1);
                break;
            case VANILLA:
                iceCream = new VanillaIceCream(1);
                break;
            case CHOCOLATE:
                iceCream = new ChocolateIceCream(1);
                break;
        }
        return iceCream;
    }
}
