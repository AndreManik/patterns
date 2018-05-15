package patternsP.chain.logger;

public class EmailLogger extends Logger {
    public EmailLogger(Level priority) {
        super(priority);
    }

    public void write (String message) {
        System.out.println("Email: " + message);
    }
}