package patternsP.chain.logger;

public class SMSLogger extends Logger {
    public SMSLogger(Level priority) {
        super(priority);
    }
    public void write (String message) {
        System.out.println("SMS: " + message);
    }
}