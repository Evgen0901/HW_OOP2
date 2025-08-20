package ru.netology.javaqa.HW_OOP2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void acceptableRadioStation08() {
        Radio radio = new Radio();

        radio.setCurrentStation(8);

        int expected = 8;
        int action = radio.getCurrentStation();

        Assertions.assertEquals(expected, action);
    }

    @Test
    public void acceptableRadioStation09() {
        Radio radio = new Radio();

        radio.setCurrentStation(9);

        int expected = 9;
        int action = radio.getCurrentStation();

        Assertions.assertEquals(expected, action);
    }

    @Test
    public void notAnAcceptableRadioStation10() {
        Radio radio = new Radio();

        radio.setCurrentStation(10);

        int expected = 0;
        int action = radio.getCurrentStation();

        Assertions.assertEquals(expected, action);
    }

    @Test
    public void notAnAcceptableRadioStation01() {
        Radio radio = new Radio();

        radio.setCurrentStation(-1);

        int expected = 0;
        int action = radio.getCurrentStation();

        Assertions.assertEquals(expected, action);
    }

    @Test
    public void acceptableRadioStation00() {
        Radio radio = new Radio();

        radio.setCurrentStation(0);

        int expected = 0;
        int action = radio.getCurrentStation();

        Assertions.assertEquals(expected, action);
    }

    @Test
    public void acceptableRadioStation1() {
        Radio radio = new Radio();

        radio.setCurrentStation(1);

        int expected = 1;
        int action = radio.getCurrentStation();

        Assertions.assertEquals(expected, action);
    }

    @Test
    public void radiStationReplay00() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);

        radio.next();

        int expected = 1;
        int action = radio.getCurrentStation();

        Assertions.assertEquals(expected, action);
    }

    @Test
    public void radiStationReplay01() {
        Radio radio = new Radio();
        radio.setCurrentStation(1);

        radio.next();

        int expected = 2;
        int action = radio.getCurrentStation();

        Assertions.assertEquals(expected, action);
    }

    @Test
    public void radiStationReplay08() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);

        radio.next();

        int expected = 9;
        int action = radio.getCurrentStation();

        Assertions.assertEquals(expected, action);
    }

    @Test
    public void radiStationReplay09() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);

        radio.next();

        int expected = 0;
        int action = radio.getCurrentStation();

        Assertions.assertEquals(expected, action);
    }

    @Test
    public void rewindingTheRadioStation00() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);

        radio.prev();

        int expected = 9;
        int action = radio.getCurrentStation();

        Assertions.assertEquals(expected, action);
    }

    @Test
    public void rewindingTheRadioStation09() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);

        radio.prev();

        int expected = 8;
        int action = radio.getCurrentStation();

        Assertions.assertEquals(expected, action);
    }

    @Test
    public void SoundMagnificationAt98() {
        Radio radio = new Radio();
        radio.setCurrentVolume(98);

        radio.volumePlus();

        int expected = 99;
        int action = radio.getCurrentVolume();

        Assertions.assertEquals(expected, action);
    }

    @Test
    public void SoundMagnificationAt99() {
        Radio radio = new Radio();
        radio.setCurrentVolume(99);

        radio.volumePlus();

        int expected = 100;
        int action = radio.getCurrentVolume();

        Assertions.assertEquals(expected, action);
    }

    @Test
    public void SoundMagnificationAt100() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);

        radio.volumePlus();

        int expected = 100;
        int action = radio.getCurrentVolume();

        Assertions.assertEquals(expected, action);
    }

    @Test
    public void soundReduction02() {
        Radio radio = new Radio();
        radio.setCurrentVolume(2);

        radio.volumeMinus();

        int expected = 1;
        int action = radio.getCurrentVolume();

        Assertions.assertEquals(expected, action);
    }

    @Test
    public void soundReduction01() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);

        radio.volumeMinus();

        int expected = 0;
        int action = radio.getCurrentVolume();

        Assertions.assertEquals(expected, action);
    }

    @Test
    public void soundReduction00() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);

        radio.volumeMinus();

        int expected = 0;
        int action = radio.getCurrentVolume();

        Assertions.assertEquals(expected, action);
    }

    @Test
    public void theSoundIsLessThanTheMinimum01() {
        Radio radio = new Radio();


        radio.setCurrentVolume(-1);


        int expected = 0;
        int action = radio.getCurrentVolume();

        Assertions.assertEquals(expected, action);
    }

    @Test
    public void theSoundIsLessThanTheMax110() {
        Radio radio = new Radio();


        radio.setCurrentVolume(101);


        int expected = 0;
        int action = radio.getCurrentVolume();

        Assertions.assertEquals(expected, action);
    }

}
