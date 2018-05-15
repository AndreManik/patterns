package patternsP.state.context;

import patternsP.state.state.Radio7;
import patternsP.state.state.RadioDFM;
import patternsP.state.state.Station;
import patternsP.state.state.VestiFM;

//context
public class Radio {
    Station station;
    public void setStation(Station station) {
        this.station = station;
    }
    public void play() {
        station.play();
    }
    public void nextStation() {
        if (station instanceof Radio7) {
            setStation(new RadioDFM());
        } else if(station instanceof RadioDFM) {
            setStation(new VestiFM());
        } else if(station instanceof VestiFM) {
            setStation(new Radio7());
        }
    }
}
