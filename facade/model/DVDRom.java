package patternsP.facade.model;

public class DVDRom {
    private boolean data = false;
    public boolean hasData() {
        return data;
    }
    protected void load() {
        data = true;
    }
    protected void unload() {
        data = false;
    }
}