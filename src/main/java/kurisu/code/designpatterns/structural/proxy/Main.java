package kurisu.code.designpatterns.structural.proxy;

/**
 * Proxy Design Pattern
 * 
 * This uses a shallow copy of a "real" class, that serves as a barrier (proxy)
 * before touching the real one, allowing to add in between any other required logic
 * like expiration dates, loging etc.
 */
public class Main {
    public static void main(String[] args) {
        Library lib = new Library();
        String[] fileNames = {"fileA", "fileB", "fileC"};
        for (String fileName : fileNames) {
            lib.add(new LoggingEbookProxy(fileName));
        }

        lib.openEbook("fileA");
        lib.openEbook("fileB");
    }
    
}
