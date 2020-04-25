package my.practice.oops.patterns.creational.factorypattern;

/**
 * @author prince arora
 */
public class EncoderFactory {

    public static Encoder getEncoder(Encoder.Algorithm algorithm) {
        Encoder encoder = null;
        switch (algorithm) {
            case SHA256:
                encoder = new SHA256Encoder();
                break;

            case SHA512:
                encoder = new SHA512Encoder();
                break;
        }
        return encoder;
    }
}
