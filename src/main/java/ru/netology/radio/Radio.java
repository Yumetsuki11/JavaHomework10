package ru.netology.radio;

public class Radio {

    public byte station;
    public byte volume;

    public void setStation(byte newStation) {
        if (newStation > -1 & newStation < 10) {
            station = newStation;
        }
    }

    public void prevStation() {
        if (station == 0) {
            station = 9;
        }
        else {
            station -= 1;
        }
    }

    public void nextStation() {
        if (station == 9) {
            station = 0;
        }
        else {
            station += 1;
        }
    }

    public void minusVolume() {
        if (volume != 0) {
            volume -= 1;
        }
    }

    public void plusVolume() {
        if (volume != 10) {
            volume += 1;
        }
    }
}
