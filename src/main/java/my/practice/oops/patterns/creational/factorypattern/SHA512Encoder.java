package my.practice.oops.patterns.creational.factorypattern;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * @author prince arora
 */
public class SHA512Encoder extends Encoder {

    @Override
    Algorithm getAlgorithm() {
        return Algorithm.SHA512;
    }

    @Override
    protected byte[] encrypt() throws NoSuchAlgorithmException {
        return MessageDigest.getInstance("SHA-512")
                        .digest(this.getPlainText().getBytes());
    }
}
