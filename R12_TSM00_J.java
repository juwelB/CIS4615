// Do not override thread-safe methods with methods that are not thread-safe

/**
 * R12_TSM00_J
 */
public class R12_TSM00_J {

    class Base {

        public synchronized void doSomething() {
            // ...
        }
    }

    class Derived extends Base {

        @Override
        public void doSomething() {
            // ...
        }
    }
}
