//Do not throw RuntimeException, Exception, or Throwable

/**
 * R07_ERR07_J
 */
public class R07_ERR07_J {

    boolean isCapitalized(String s) {
        if (s == null) {
            throw new NullPointerException();
        }
        if (s.equals("")) {
            return true;
        }
        String first = s.substring(0, 1);
        String rest = s.substring(1);
        return (first.equals(first.toUpperCase())
                && rest.equals(rest.toLowerCase()));
    }
}
