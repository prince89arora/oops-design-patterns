package my.practice.oops.patterns.creational.prototype;

/**
 * @author prince arora
 */
public abstract class IceCream implements Cloneable {

    abstract Flavor getFlavor();

    abstract int quantity();

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString());
        stringBuilder.append("\n");
        stringBuilder.append(this.getFlavor());
        stringBuilder.append("\n");
        stringBuilder.append(this.quantity()).append(" kg");

        return stringBuilder.toString();
    }
}
