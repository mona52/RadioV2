package ru.netology.radioV2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    void plusChannelMax() {
        Radio radio = new Radio();
        radio.setCurrentChannel(9);
        int expected = 0;
        radio.plusChannel();
        assertEquals(expected, radio.getCurrentChannel());
    }

    @Test
    void plusChannelNormal() {
        Radio radio = new Radio();
        radio.setCurrentChannel(5);
        int expected = 6;
        radio.plusChannel();
        assertEquals(expected, radio.getCurrentChannel());
    }


    @Test
    void minusChannelMin() {
        Radio radio = new Radio();
        radio.setCurrentChannel(0);
        int expected = 9;
        radio.minusChannel();
        assertEquals(expected, radio.getCurrentChannel());
    }

    @Test
    void minusChannelNormal() {
        Radio radio = new Radio();
        radio.setCurrentChannel(7);
        int expected = 6;
        radio.minusChannel();
        assertEquals(expected, radio.getCurrentChannel());
    }

    @Test
    void plusVolumeMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        int expected = 10;
        radio.plusVolume();
        assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    void plusVolumeNormal() {
        Radio radio = new Radio();
        radio.setCurrentVolume(8);
        int expected = 9;
        radio.plusVolume();
        assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    void minusVolumeMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        int expected = 0;
        radio.minusVolume();
        assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    void minusVolumeNormal() {
        Radio radio = new Radio();
        radio.setCurrentVolume(9);
        int expected = 8;
        radio.minusVolume();
        assertEquals(expected, radio.getCurrentVolume());
    }


    @Test
    void setCurrentChannelUpperMax() {
        Radio radio = new Radio();
        radio.setCurrentChannel(10);
        int expected = 0;
        assertEquals(expected, radio.getCurrentChannel());
    }

    @Test
    void setCurrentChannelBelowMin() {
        Radio radio = new Radio();
        radio.setCurrentChannel(-1);
        int expected = 0;
        assertEquals(expected, radio.getCurrentChannel());
    }

    @Test
    void setCurrentChannelNormal() {
        Radio radio = new Radio();
        radio.setCurrentChannel(5);
        int expected = 5;
        assertEquals(expected, radio.getCurrentChannel());
    }

    @Test
    void setCurrentVolumeUpperMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(11);
        int expected = 0;
        assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    void setCurrentVolumeBelowMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        int expected = 0;
        assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    void setCurrentVolumeNormal() {
        Radio radio = new Radio();
        radio.setCurrentVolume(7);
        int expected = 7;
        assertEquals(expected, radio.getCurrentVolume());
    }
}