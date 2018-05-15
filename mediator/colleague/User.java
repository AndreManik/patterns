package patternsP.mediator.colleague;

import patternsP.mediator.media.Chat;

//colleague
public abstract class User {
    private Chat chat;
    private String name;
    private boolean enable = true;

    public User(Chat chat, String name) {
        this.chat = chat;
        this.name = name;
    }

    public boolean isEnable() {
        return enable;
    }
    public void setEnable(boolean enable) {
        this.enable = enable;
    }

    public String getName() {
        return name;
    }
    public void sendMessage(String message) {
        chat.sendMessage(message, this);
    }
    public void getMessage(String message) {
        write();
        System.out.println("take the message: '" + message + "'");
    }

    abstract void write();

    public String toString() {
        return "User {" +
                "chat=" + chat +
                ", name='" + name + '\'' +
                ", enable=" + enable +
                '}';
    }
}
