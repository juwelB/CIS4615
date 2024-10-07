// Rule 00. Input Validation and Data Sanitization (IDS)

/**
 * R00_IDS03_J
 */
public class R00_IDS03_J {

    public String sanitizeUser(String username) {
        return Pattern.matches("[A-Za-z0-9_]+", username)
        )
      ? username:
        "unauthorized user";
    }

    public static void main(String[] args) {

        if (loginSuccessful) {
            logger.severe("User login succeeded for: " + sanitizeUser(username));
        } else {
            logger.severe("User login failed for: " + sanitizeUser(username));
        }

    }

}
