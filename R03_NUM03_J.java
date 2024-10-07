//Rule 03. Numeric Types and Operations (NUM)

import java.io.DataInputStream;
import java.io.IOException;

/**
 * R03_NUM03_J
 */
public class R03_NUM03_J {

    public static long getInteger(DataInputStream is) throws IOException {
        return is.readInt() & 0xFFFFFFFFL; // Mask with 32 one-bits
    }
}
