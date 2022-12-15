package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    Radio radio = new Radio(30);
    Radio service = new Radio();

    @Test
    public void shouldSetDirectStationIfMoreThenChanels() {
        radio.setDirectStation(30);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetDirectStation() {
        radio.setDirectStation(4);

        int expected = 4;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetDirectStationIfLessThenMin() {
        radio.setDirectStation(radio.getMinStation() - 1);

        int expected = radio.getMinStation();
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetDirectStationIfMoreThenMax() {
        radio.setDirectStation(radio.getMaxStation() + 1);

        int expected = radio.getMinStation();
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevStation() {
        radio.setDirectStation(9);
        radio.setPrevStation();

        int expected = 8;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMaxStationIfPrevIsNull() {
        radio.setDirectStation(radio.getMinStation());
        radio.setPrevStation();

        int expected = radio.getMaxStation();
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextStation() {
        radio.setDirectStation(6);
        radio.setNextStation();

        int expected = 7;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMaxStation() {

        int expected = 9;
        int actual = service.getMaxStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNullStationIfCurrentIsMax() {
        radio.setDirectStation(radio.getMaxStation());
        radio.setNextStation();

        int expected = radio.getMinStation();
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchVolumeUp() {
        radio.setCurrentVolume(9);
        radio.setVolumeUp();

        int expected = 10;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldRemainMaxVolumeIfAlreadyMax() {
        radio.setCurrentVolume(radio.getMaxVolume());
        radio.setVolumeUp();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReduceVolume() {
        radio.setCurrentVolume(9);
        radio.reduceVolume();

        int expected = 8;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldRemainMinVolumeIfAlreadyMin() {
        radio.setCurrentVolume(radio.getMinVolume());
        radio.reduceVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}


