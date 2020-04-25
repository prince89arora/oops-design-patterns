package my.practice.oops.patterns.creational.factorypattern;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * @author prince arora
 */
public class SHA256Encoder extends Encoder {

    @Override
    Algorithm getAlgorithm() {
        return Algorithm.SHA256;
    }

    @Override
    protected byte[] encrypt() throws NoSuchAlgorithmException {
        return MessageDigest.getInstance("SHA-256")
                        .digest(this.getPlainText().getBytes(StandardCharsets.UTF_8));
    }
}
