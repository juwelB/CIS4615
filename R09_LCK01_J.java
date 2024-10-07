//Do not synchronize on objects that may be reused

/**
 * R09_LCK01_J
 */
public class R09_LCK01_J {

    private final Object lock = new Object();

    public void doSomething() {
        synchronized (lock) {
            // ...
        }
    }

}
