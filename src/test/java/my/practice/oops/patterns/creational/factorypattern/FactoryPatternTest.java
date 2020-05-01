package my.practice.oops.patterns.creational.factorypattern;

import org.junit.Assert;
import org.junit.Test;

import java.security.NoSuchAlgorithmException;

/**
 * @author prince arora
 */
public class FactoryPatternTest {

    private static final String HASH_256 = "0300dc429eeb82775c426d87a5fd72c1bba7a35f56a4804df8b3c35c38df6813";
    private static final String HASH_512 = "b6e53eacf0b86151dabf9712ad1fc858c8691b54bf7ed6e699b8a0402c59e99c9c6c6a14c3b9765eed17fdfe91331c58235c8967ffd1f72c52df7a6d8382c6f7";

    @Test
    public void test_encoderSHA256() {
        Encoder encoder = EncoderFactory.getEncoder(Encoder.Algorithm.SHA256);
        try {
            String hash = encoder.text("Prince").encode();
            Assert.assertEquals(hash, HASH_256);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test_encoderSHA512() {
        Encoder encoder = EncoderFactory.getEncoder(Encoder.Algorithm.SHA512);
        try {
            String hash = encoder.text("Arora").encode();
            Assert.assertEquals(hash, HASH_512);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }
}
