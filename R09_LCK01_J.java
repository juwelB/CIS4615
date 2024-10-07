//Do not synchronize on objects that may be reused

/**
 * R09_LCK01_J
 */
public class R09_LCK01_J {

    private final Boolean initialized = Boolean.FALSE;

    public void doSomething() {
        synchronized (initialized) {
            // ...
        }
    }

}
