package patternsP.command;

import patternsP.command.concreteCommand.ResetCommand;
import patternsP.command.concreteCommand.StartCommand;
import patternsP.command.concreteCommand.StopCommand;
import patternsP.command.invoker.User;
import patternsP.command.receiver.Comp;

public class CommandApp {
    public static void main(String[] args) {
        Comp comp = new Comp();
        User user = new User(new StartCommand(comp), new StopCommand(comp), new ResetCommand(comp));

        user.startComputer();
        user.stopComputer();
        user.resetComputer();
    }
}

