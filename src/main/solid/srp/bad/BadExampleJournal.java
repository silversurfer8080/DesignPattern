package srp.bad;

import java.io.PrintStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class BadExampleJournal {

    private static final List<String> entries = new ArrayList<String>();

    private static final int count = 0;

    public static void addEntry(String entry) {
        entries.add(entry);
    }

    public void removeEntry(String entry) {
        entries.remove(entry);
    }

    @Override
    public String toString() {
        return String.join("\n", entries);
    }

    // The following methods violate SRP, because they are not part of the responsibility of the class.
    // They should be removed and stay out of this class,
    public void save(String filename) throws Exception {
        try (PrintStream out = new PrintStream(filename)) {
            out.println(this.toString());
        }
    }

    public void load(String filename) throws Exception {    }
    public void load(URL url) throws Exception {    }



}
