package srp.good;

import java.io.File;
import java.io.PrintStream;
import java.net.URL;

public class Persistence {

    public void saveToFile(Journal journal, String filename, boolean override) throws Exception {
        if(override || new File(filename).exists()) {
            try (PrintStream out = new PrintStream(filename)) {
                out.println(journal.toString());
            }
        }
    }

    public void load(Journal jounal, String filename) throws Exception {    }
    public void load(Journal journal, URL url) throws Exception {    }

}
