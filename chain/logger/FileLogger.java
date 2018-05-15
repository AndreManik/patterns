package patternsP.chain.logger;

public class FileLogger extends Logger {
    public FileLogger(Level priority) {
        super(priority);
    }

    public void write (String message) {
        System.out.println("Write to file: " + message);
    }
}