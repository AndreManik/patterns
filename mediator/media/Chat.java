package patternsP.mediator.media;

import patternsP.mediator.colleague.User;

//mediator
public interface Chat {
    void sendMessage (String message, User user);
}
