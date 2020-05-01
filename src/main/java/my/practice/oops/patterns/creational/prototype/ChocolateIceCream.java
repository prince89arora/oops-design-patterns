package my.practice.oops.patterns.creational.prototype;

/**
 * @author prince arora
 */
public class ChocolateIceCream extends IceCream {

    private int quantity = 0;

    public ChocolateIceCream(int quantity) {
        this.quantity= quantity;
    }

    @Override
    public Flavor getFlavor() {
        return Flavor.CHOCOLATE;
    }

    @Override
    public int quantity() {
        return this.quantity;
    }
}
