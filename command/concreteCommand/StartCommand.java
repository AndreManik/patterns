package patternsP.command.concreteCommand;

import patternsP.command.receiver.Comp;

public class StartCommand implements Command {
    private Comp comp;

    public StartCommand (Comp comp) {
        this. comp = comp;
    }
    public void execute() {
        comp.start();
    }
}