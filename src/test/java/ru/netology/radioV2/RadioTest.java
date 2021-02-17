package ru.netology.radioV2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    void selectionChannelUpperMax() {
        Radio radio = new Radio();
        int currentChannel = 10;
        int expected = 0;
        int actual = radio.plusChannel(currentChannel, radio.getMaxChannel(), radio.getMinChannel());
        assertEquals(expected, actual);
    }

    @Test
    void selectionChannelBelowMin() {
        Radio radio = new Radio();
        int currentChannel = -1;
        int expected = 9;
        int actual = radio.minusChannel(currentChannel, radio.getMaxChannel(), radio.getMinChannel());
        assertEquals(expected, actual);
    }


    @Test
    void selectionVolumeUpperMax() {
        Radio radio = new Radio();
        int currentVolume = 11;
        int expected = 10;
        int actual = radio.plusVolume(currentVolume, radio.getMaxVolume(), radio.getMinVolume());
        assertEquals(expected, actual);
    }

    @Test
    void selectionVolumeBelowMin() {
        Radio radio = new Radio();
        int currentVolume = -1;
        int expected = 0;
        int actual = radio.minusVolume(currentVolume, radio.getMaxVolume(), radio.getMinVolume());
        assertEquals(expected, actual);
    }


}