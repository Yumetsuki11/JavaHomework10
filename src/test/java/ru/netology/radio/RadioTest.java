package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class RadioTest {
    Radio radio = new Radio();

    @ParameterizedTest
    @CsvSource({
            "-42, 10",
            "-1, 10",
            "0, 10",
            "1, 1",
            "4, 4",
            "9, 9",
            "10, 10",
            "11, 11",
            "42, 42"
    })
    void parameterizedConstructorTest(int stationsCount, int expected) {
        Radio customRadio = new Radio(stationsCount);

        Assertions.assertEquals(expected, customRadio.getStationsCount());
    }

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
    void setStationTest(int station, int expected) {
        radio.setStation(station);

        Assertions.assertEquals(expected, radio.getStation());
    }

    @ParameterizedTest
    @CsvSource({
            "0, 9",
            "1, 0",
            "4, 3",
            "9, 8"
    })
    void prevStationTest(int station, int expected) {
        radio.setStation(station);
        radio.prevStation();

        Assertions.assertEquals(expected, radio.getStation());
    }

    @ParameterizedTest
    @CsvSource({
            "0, 1",
            "4, 5",
            "8, 9",
            "9, 0"
    })
    void nextStationTest(int station, int expected) {
        radio.setStation(station);
        radio.nextStation();

        Assertions.assertEquals(expected, radio.getStation());
    }

    @ParameterizedTest
    @CsvSource({
            "-42, 0",
            "-1, 0",
            "0, 0",
            "1, 1",
            "42, 42",
            "99, 99",
            "100, 100",
            "101, 0",
            "1337, 0"
    })
    void setVolumeTest(int volume, int expected) {
        radio.setVolume(volume);

        Assertions.assertEquals(expected, radio.getVolume());
    }

    @ParameterizedTest
    @CsvSource({
            "0, 0",
            "1, 0",
            "4, 3",
            "99, 98",
            "100, 99"
    })
    void minusVolumeTest(int volume, int expected) {
        radio.setVolume(volume);
        radio.minusVolume();

        Assertions.assertEquals(expected, radio.getVolume());
    }

    @ParameterizedTest
    @CsvSource({
            "0, 1",
            "1, 2",
            "4, 5",
            "99, 100",
            "100, 100"
    })
    void plusVolumeTest(int volume, int expected) {
        radio.setVolume(volume);
        radio.plusVolume();
        
        Assertions.assertEquals(expected, radio.getVolume());
    }
}
