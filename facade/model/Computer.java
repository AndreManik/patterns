package patternsP.facade.model;

public class Computer { //facade
    private Power power = new Power();
    private DVDRom dvdRom = new DVDRom();
    private HDD hdd = new HDD();

    public void copy() {
        power.on();
        dvdRom.load();
        hdd.copyFromDVD(dvdRom);
    }

    public void close() {
        dvdRom.unload();
        hdd.copyFromDVD(dvdRom);
        power.off();
    }
}