package my.practice.oops.patterns.creational.prototype;

/**
 * @author prince arora
 */
public class MixIceCream extends IceCream {

    private int quantity = 0;

    public MixIceCream(int quantity) {
        this.quantity= quantity;
    }

    @Override
    public Flavor getFlavor() {
        return Flavor.MIX;
    }

    @Override
    public int quantity() {
        return this.quantity;
    }
}
