package patternsP.mediator.colleague;

import patternsP.mediator.media.Chat;

//concrete colleague
public class SimpleUser extends User {
    public SimpleUser(Chat chat, String name) {
        super(chat, name);
    }
    void write() {
        System.out.print("User " + getName() + " ");
    }
}