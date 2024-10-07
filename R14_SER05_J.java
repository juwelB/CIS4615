// Do not serialize instances of inner classes

import java.io.Serializable;

/**
 * R14_SER05_J
 */
public class R14_SER05_J {

    public class OuterSer implements Serializable {

        private int rank;

        class InnerSer implements Serializable {

            protected String name;
            // ...
        }
    }
}
