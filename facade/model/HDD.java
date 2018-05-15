package patternsP.facade.model;

public class HDD {
    protected void copyFromDVD(DVDRom dvdRom) {
        if (dvdRom.hasData()) {
            System.out.println("Copy data...");
        } else {
            System.out.println("Insert data disc...");
        }
    }
}