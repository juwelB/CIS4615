// Rule 02. Expressions (EXP)

import java.io.File;

/**
 * R02_XP00_J
 */
public class R02_XP00_J {

    public void deleteFile() {

        File someFile = new File("someFileName.txt");
        // Do something with someFile
        if (!someFile.delete()) {
            // Handle failure to delete the file
        }

    }

}
