package ru.netology.radioV2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    void plusChannelUpperMax() {
        Radio radio = new Radio();
        int currentChannel = 10;
        int expected = 0;
        int actual = radio.plusChannel(currentChannel, radio.getMaxChannel(), radio.getMinChannel());
        assertEquals(expected, actual);
    }

    @Test
    void plusChannelNormal() {
        Radio radio = new Radio();
        int currentChannel = 5;
        int expected = 6;
        int actual = radio.plusChannel(currentChannel, radio.getMaxChannel(), radio.getMinChannel());
        assertEquals(expected, actual);
    }


    @Test
    void minusChannelBelowMin() {
        Radio radio = new Radio();
        int currentChannel = -1;
        int expected = 9;
        int actual = radio.minusChannel(currentChannel, radio.getMaxChannel(), radio.getMinChannel());
        assertEquals(expected, actual);
    }

    @Test
    void minusChannelNormal() {
        Radio radio = new Radio();
        int currentChannel = 7;
        int expected = 6;
        int actual = radio.minusChannel(currentChannel, radio.getMaxChannel(), radio.getMinChannel());
        assertEquals(expected, actual);
    }

    @Test
    void plusVolumeUpperMax() {
        Radio radio = new Radio();
        int currentVolume = 11;
        int expected = 10;
        int actual = radio.plusVolume(currentVolume, radio.getMaxVolume(), radio.getMinVolume());
        assertEquals(expected, actual);
    }
    @Test
    void plusVolumeNormal() {
        Radio radio = new Radio();
        int currentVolume = 8;
        int expected = 9;
        int actual = radio.plusVolume(currentVolume, radio.getMaxVolume(), radio.getMinVolume());
        assertEquals(expected, actual);
    }

    @Test
    void minusVolumeBelowMin() {
        Radio radio = new Radio();
        int currentVolume = -1;
        int expected = 0;
        int actual = radio.minusVolume(currentVolume, radio.getMaxVolume(), radio.getMinVolume());
        assertEquals(expected, actual);
    }

    @Test
    void minusVolumeNormal() {
        Radio radio = new Radio();
        int currentVolume = 5;
        int expected = 4;
        int actual = radio.minusVolume(currentVolume, radio.getMaxVolume(), radio.getMinVolume());
        assertEquals(expected, actual);
    }


    @Test
    void setCurrentChannelUpperMax() {
        Radio radio = new Radio();
        int currentChannel = 10;
        int expected = 0;
        radio.setCurrentChannel(currentChannel);
        assertEquals(expected, radio.getCurrentChannel());
    }

    @Test
    void setCurrentChanneBelowMin() {
        Radio radio = new Radio();
        int currentChannel = -1;
        int expected = 0;
        radio.setCurrentChannel(currentChannel);
        assertEquals(expected, radio.getCurrentChannel());
    }

    @Test
    void setCurrentChanneNormal() {
        Radio radio = new Radio();
        int currentChannel = 5;
        int expected = 5;
        radio.setCurrentChannel(currentChannel);
        assertEquals(expected, radio.getCurrentChannel());
    }

    @Test
    void setCurrentVolumeUpperMax() {
        Radio radio = new Radio();
        int currentVolume = 11;
        int expected = 0;
        radio.setCurrentVolume(currentVolume);
        assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    void setCurrentVolumeBelowMin() {
        Radio radio = new Radio();
        int currentVolume = -1;
        int expected = 0;
        radio.setCurrentVolume(currentVolume);
        assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    void setCurrentVolumeNormal() {
        Radio radio = new Radio();
        int currentVolume = 7;
        int expected = 7;
        radio.setCurrentVolume(currentVolume);
        assertEquals(expected, radio.getCurrentVolume());
    }
}