package patternsP.mediator.media;

import patternsP.mediator.colleague.Admin;
import patternsP.mediator.colleague.SimpleUser;
import patternsP.mediator.colleague.User;

import java.util.ArrayList;
import java.util.List;

//concrete mediator
public class TextChat implements Chat {
    User admin;
    List<User> users = new ArrayList<>();

    public void setAdmin(User admin) {
        if (admin != null && admin instanceof Admin) {
            this.admin = admin;
        } else {
            throw new RuntimeException("Sorry, but you rights are insufficient");
        }
    }
    public void addUser(User user) {
        if (admin == null) {
            throw new RuntimeException("Chat don't have administrator");
        } else if (user instanceof SimpleUser){
            users.add(user);
        } else {
            throw new RuntimeException("Sorry, incorrect type");
        }
    }

    public void sendMessage (String message, User user) {
        if (user instanceof Admin) {
            for (User u : users) {
                u.getMessage(user.getName() + ": " + message);
            }
        }
        if (user instanceof SimpleUser) {
            for (User u : users) {
                if (u != user && u.isEnable()) {
                    u.getMessage(user.getName() + ": " + message);
                }
            }
            if (admin.isEnable()) {
                admin.getMessage(message);
            }
        }
    }
}