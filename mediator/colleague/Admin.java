package patternsP.mediator.colleague;

import patternsP.mediator.media.Chat;

//concrete colleague
public class Admin extends User {
    public Admin(Chat chat, String name) {
        super(chat, name);
    }
    void write() {
        System.out.print("Admin " + getName() + " ");
    }
}
