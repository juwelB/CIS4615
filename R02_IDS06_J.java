//Exclude unsanitized user input from format strings

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * R02_IDS06_J
 */
public class R02_IDS06_J {

    class Format {

        static Calendar c
                = new GregorianCalendar(1995, GregorianCalendar.MAY, 23);

        public static void main(String[] args) {
            // args[0] is the credit card expiration date
            // Perform comparison with c,
            // if it doesn't match, print the following line
            System.out.format(
                    "%s did not match! HINT: It was issued on %terd of some month",
                    args[0], c
            );
        }
    }
}
