package patternsP.mediator;

import patternsP.mediator.colleague.Admin;
import patternsP.mediator.colleague.SimpleUser;
import patternsP.mediator.colleague.User;
import patternsP.mediator.media.TextChat;

public class MediatorApp {
    public static void main(String[] args) {
        TextChat textChat = new TextChat();
        Admin admin = new Admin(textChat, "Petr Petrovich");
        User user1 = new SimpleUser(textChat, "Stepan");
        User  user2 = new SimpleUser(textChat, "Vasiliy");

        textChat.setAdmin(admin);
        textChat.addUser(user1);
        textChat.addUser(user2);

        user1.sendMessage("Hello");
        admin.sendMessage("ADMIN");
    }
}








