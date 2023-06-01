import srp.good.Journal;
import srp.good.Persistence;

public class Demo {
    public static void main(String[] args) throws Exception {
        Journal journal = new Journal();
        journal.addEntry("First entry");
        journal.addEntry("Second entry");
        journal.addEntry("Third entry");
        System.out.println(journal);

        Persistence p = new Persistence();
        String filename = "c:\\temp\\journal.txt";

        p.saveToFile(journal, filename, true);

        Runtime.getRuntime().exec("notepad.exe " + filename);

    }
}
