package my.practice.oops.patterns.creational.factorypattern;


import java.security.NoSuchAlgorithmException;

/**
 * @author prince arora
 */
public abstract class Encoder {

    private String plainText;

    abstract Algorithm getAlgorithm();

    public String getPlainText() {
        return this.plainText;
    }

    public Encoder text(String text) {
        this.plainText = text;
        return this;
    }

    public String encode() throws NoSuchAlgorithmException {
        return this.toHaxString(this.encrypt());
    }

    protected abstract byte[] encrypt() throws NoSuchAlgorithmException;

    private String toHaxString(byte[] digested) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < digested.length; i++) {
            String hex = Integer.toHexString(0xff & digested[i]);
            if (hex.length() == 1) stringBuilder.append('0');
            stringBuilder.append(hex);
        }
        return stringBuilder.toString();
    }

    public static enum  Algorithm {
        SHA256,
        SHA512
    }
}
