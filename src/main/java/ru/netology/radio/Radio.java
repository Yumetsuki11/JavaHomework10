package ru.netology.radio;

public class Radio {

    private int station;
    private int volume;
    private int stationsCount = 10;

    public Radio() {
    }

    public Radio(int stationsCount) {
        if (stationsCount > 0) {
            this.stationsCount = stationsCount;
        }
    }

    public int getStation() {
        return station;
    }

    public int getVolume() {
        return volume;
    }

    public int getStationsCount() {
        return stationsCount;
    }

    public void setStation(int station) {
        if (station > -1 & station < getStationsCount()) {
            this.station = station;
        } else {
            this.station = 0;
        }
    }

    public void setVolume(int volume) {
        if (volume > -1 & volume < 101) {
            this.volume = volume;
        } else {
            this.volume = 0;
        }
    }

    public void prevStation() {
        if (getStation() == 0) {
            setStation(getStationsCount() - 1);
        } else {
            setStation(getStation() - 1);
        }
    }

    public void nextStation() {
        if (getStation() == getStationsCount() - 1) {
            setStation(0);
        } else {
            setStation(getStation() + 1);
        }
    }

    public void minusVolume() {
        if (getVolume() != 0) {
            setVolume(getVolume() - 1);
        }
    }

    public void plusVolume() {
        if (getVolume() != 100) {
            setVolume(getVolume() + 1);
        }
    }
}
