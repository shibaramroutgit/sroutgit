package functionalinterface;

/**
 * Abstract method can not be private , as objective is to implements the abstract method
 * Abstract method can be with public, protected and default
 *
 * An interface which has a single abstract method or single antarctic method with @FunctionalInterface
 * An interface can hold any number of static and default methods
 * It is helpful to use interface without implementing interface  (Reduce class count)
 */
@FunctionalInterface
public interface IntAddition {
    public abstract int addInt(int a, int b);

}
