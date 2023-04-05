package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.Radio;

public class RadioTest {

    @Test
    public void shouldSetStation() {
        Radio radi = new Radio();
        radi.setCurrentRadioStation(5);
        int expected = 5;
        int actual = radi.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetStationOverLimit() {
        Radio radi = new Radio();
        radi.setCurrentRadioStation(15);
        int expected = 0;
        int actual = radi.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetStationMinus() {
        Radio radi = new Radio();
        radi.setCurrentRadioStation(-2);
        int expected = 0;
        int actual = radi.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetStationZero() {
        Radio radi = new Radio();
        radi.setCurrentRadioStation(0);
        int expected = 0;
        int actual = radi.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetStationMax() {
        Radio radi = new Radio();
        radi.setCurrentRadioStation(9);
        int expected = 9;
        int actual = radi.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSwitchToNextStation() {
        Radio radi = new Radio();
        radi.setCurrentRadioStation(5);
        radi.next();
        int expected = 6;
        int actual = radi.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSwitchToNextStationAfterNine() {
        Radio radi = new Radio();
        radi.setCurrentRadioStation(9);
        radi.next();
        int expected = 0;
        int actual = radi.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSwitchToPrevStation() {
        Radio radi = new Radio();
        radi.setCurrentRadioStation(9);
        radi.prev();
        int expected = 8;
        int actual = radi.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSwitchToPrevStationAfterZero() {
        Radio radi = new Radio();
        radi.setCurrentRadioStation(0);
        radi.prev();
        int expected = 9;
        int actual = radi.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }
    ///////////////////////////////////////////////////
    @Test
    public void shouldSetVolume() {
        Radio radi = new Radio();
        radi.setVolume(25);
        int expected = 25;
        int actual = radi.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetZeroVolume() {
        Radio radi = new Radio();
        radi.setVolume(0);
        int expected = 0;
        int actual = radi.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetMaxVolume() {
        Radio radi = new Radio();
        radi.setVolume(100);
        int expected = 100;
        int actual = radi.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetVolumeOverLimit() {
        Radio radi = new Radio();
        radi.setVolume(110);
        int expected = 0;
        int actual = radi.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetVolumeUnderLimit() {
        Radio radi = new Radio();
        radi.setVolume(-1);
        int expected = 0;
        int actual = radi.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldNotSwitchToNextVolumeAfterMax() {
        Radio radi = new Radio();
        radi.setVolume(100);
        radi.increaseVolume();
        int expected = 100;
        int actual = radi.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void increaseVolumeZero() {
        Radio radi = new Radio();
        radi.setVolume(0);
        radi.increaseVolume();
        int expected = 1;
        int actual = radi.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void increaseVolumeMax() {
        Radio radi = new Radio();
        radi.setVolume(99);
        radi.increaseVolume();
        int expected = 100;
        int actual = radi.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void reduceVolumeMin() {
        Radio radi = new Radio();
        radi.setVolume(1);
        radi.reduceVolume();
        int expected = 0;
        int actual = radi.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void reduceVolumeMax() {
        Radio radi = new Radio();
        radi.setVolume(100);
        radi.reduceVolume();
        int expected = 99;
        int actual = radi.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void reduceVolumeMiddle() {
        Radio radi = new Radio();
        radi.setVolume(50);
        radi.reduceVolume();
        int expected = 49;
        int actual = radi.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void reduceVolumeUnderMin() {
        Radio radi = new Radio();
        radi.setVolume(0);
        radi.reduceVolume();
        int expected = 0;
        int actual = radi.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}