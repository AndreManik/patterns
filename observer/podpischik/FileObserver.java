package patternsP.observer.podpischik;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class FileObserver implements Observer {

    @Override
    public void handleEvent(int temp, int presser) {
        File f = null;
        try {
            f = File.createTempFile("MeteoTemp", "_txt");
            PrintWriter printWriter = new PrintWriter(f);
            printWriter.print("Weather is changed\nTemperature: " + temp + "\nPressure: " + presser);
            printWriter.flush();
            printWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}