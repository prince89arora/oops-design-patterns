package my.practice.oops.patterns.creational.singleton;

import java.util.Objects;

/**
 * @author prince arora
 */
public class SingletonPattern {

    private static SingletonPattern INSTANCE = null;

    private SingletonPattern(){}

    public static SingletonPattern getInstance() {
        if (Objects.isNull(INSTANCE)) {
            INSTANCE = new SingletonPattern();
        }
        return INSTANCE;
    }
}
