package my.practice.oops.patterns.creational.prototype;

/**
 * @author prince arora
 */
public class VanillaIceCream extends IceCream {

    private int quantity = 0;

    public VanillaIceCream(int quantity) {
        this.quantity= quantity;
    }

    @Override
    public Flavor getFlavor() {
        return Flavor.VANILLA;
    }

    @Override
    public int quantity() {
        return this.quantity;
    }
}
