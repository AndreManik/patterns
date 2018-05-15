package patternsP.command.concreteCommand;

import patternsP.command.receiver.Comp;

public class ResetCommand implements Command {
    private Comp comp;

    public ResetCommand (Comp comp) {
        this. comp = comp;
    }
    public void execute() {
        comp.reset();
    }
}
