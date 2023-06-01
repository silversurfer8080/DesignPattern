package srp.good;

import java.util.ArrayList;
import java.util.List;

public class Journal {
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
}
