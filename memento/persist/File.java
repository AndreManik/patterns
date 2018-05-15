package patternsP.memento.persist;

import patternsP.memento.model.Save;

public class File {
    Save save;
    public Save getSave() {
        return save;
    }
    public void setSave(Save save) {
        this.save = save;
    }
}