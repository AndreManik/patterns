package patternsP.chain.logger;

public abstract class Logger {
    private Level priority;
    private Logger next;
    public void setNext(Logger next) {
        this.next = next;
    }
    public Logger (Level priority) {
        this.priority = priority;
    }

    public void writeMessage(String message, Level level) {
        if (level.ordinal() <= priority.ordinal()) {
            write(message);
        }
        if (next != null) {
            next.writeMessage(message, level);
        }
    }

    abstract void write(String message);
}