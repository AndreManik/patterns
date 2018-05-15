package patternsP.command.concreteCommand;

import patternsP.command.receiver.Comp;

public class StopCommand implements Command {
    private Comp comp;

    public StopCommand (Comp comp) {
        this. comp = comp;
    }
    public void execute() {
        comp.stop();
    }
}