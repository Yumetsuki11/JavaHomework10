package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class RadioTest {
    Radio radio = new Radio();

    @ParameterizedTest
    @CsvSource({
            "-42, 0",
            "-1, 0",
            "0, 0",
            "1, 1",
            "4, 4",
            "8, 8",
            "9, 9",
            "10, 0",
            "42, 0"
    })
    void setStationTest(byte station, byte expected) {
        radio.setStation(station);
        Assertions.assertEquals(expected, radio.station);
    }

    @ParameterizedTest
    @CsvSource({
            "0, 9",
            "1, 0",
            "4, 3",
            "9, 8"
    })
    void prevStationTest(byte station, byte expected) {
        radio.setStation(station);
        radio.prevStation();
        Assertions.assertEquals(expected, radio.station);
    }

    @ParameterizedTest
    @CsvSource({
            "0, 1",
            "4, 5",
            "8, 9",
            "9, 0"
    })
    void nextStationTest(byte station, byte expected) {
        radio.setStation(station);
        radio.nextStation();
        Assertions.assertEquals(expected, radio.station);
    }

    @ParameterizedTest
    @CsvSource({
            "0, 0",
            "1, 0",
            "4, 3",
            "9, 8",
            "10, 9"
    })
    void minusVolumeTest(byte volume, byte expected) {
        radio.volume = volume;
        radio.minusVolume();
        Assertions.assertEquals(expected, radio.volume);
    }

    @ParameterizedTest
    @CsvSource({
            "0, 1",
            "1, 2",
            "4, 5",
            "9, 10",
            "10, 10"
    })
    void plusVolumeTest(byte volume, byte expected) {
        radio.volume = volume;
        radio.plusVolume();
        Assertions.assertEquals(expected, radio.volume);
    }
}
