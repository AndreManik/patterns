package patternsP.state;

import patternsP.state.context.Radio;
import patternsP.state.state.RadioDFM;
import patternsP.state.state.Station;

public class StateApp {
    public static void main(String[] args) {
        Station dfm = new RadioDFM();
        Radio radio = new Radio();
        radio.setStation(dfm);
        for (int i = 0; i < 10; i++) {
            radio.play();
            radio.nextStation();
        }
    }
}



