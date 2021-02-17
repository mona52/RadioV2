package ru.netology.radioV2;

public class Radio {
    private int maxChannel = 9;
    private int minChannel = 0;
    private int maxVolume = 10;
    private int minVolume = 0;
    private int currentChannel;
    private int currentVolume;
    private boolean on;

    public int getMaxChannel() {
        return maxChannel;
    }

    public int getMinChannel() {
        return minChannel;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public int getCurrentChannel() {
        return currentChannel;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public boolean isOn() {
        return on;
    }


    public void setCurrentChannel(int currentChannel) {
        if (currentChannel > maxChannel) {
            return;
        }
        if (currentChannel < minChannel) {
            return;
        }
        this.currentChannel = currentChannel;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume) {
            return;
        }
        if (currentVolume < minVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public static void main(String[] args) {
        Radio radio = new Radio();
        radio.setCurrentChannel(5);
        radio.setCurrentVolume(7);

        int channelPlus = radio.plusChannel(radio.getCurrentChannel(), radio.getMaxChannel(), radio.getMinChannel());
        radio.setCurrentChannel(channelPlus);
        System.out.println("Выбран радиоканал № " + radio.getCurrentChannel());
        System.out.println("Установлен уровень звука - " + radio.getCurrentVolume());

        int channelMinus = radio.minusChannel(radio.getCurrentChannel(), radio.getMaxChannel(), radio.getMinChannel());
        radio.setCurrentChannel(channelMinus);
        System.out.println("Выбран радиоканал № " + radio.getCurrentChannel());
        System.out.println("Установлен уровень звука - " + radio.getCurrentVolume());

        int volumePlus = radio.plusVolume(radio.getCurrentVolume(), radio.getMaxVolume(), radio.getMinVolume());
        radio.setCurrentVolume(volumePlus);
        System.out.println("Выбран радиоканал № " + radio.getCurrentChannel());
        System.out.println("Установлен уровень звука - " + radio.getCurrentVolume());

        int volumeMinus = radio.minusVolume(radio.getCurrentVolume(), radio.getMaxVolume(), radio.getMinVolume());
        radio.setCurrentVolume(volumeMinus);
        System.out.println("Выбран радиоканал № " + radio.getCurrentChannel());
        System.out.println("Установлен уровень звука - " + radio.getCurrentVolume());
    }



    // +1 радиоканал
    public int plusChannel(int currentChannel, int maxChannel, int minChannel) {
        int currentChannel1 = currentChannel+1;

        if (currentChannel1 > maxChannel) {
            currentChannel1 = minChannel;
        }
        return currentChannel1;
    }

    // -1 радиоканал
    public int minusChannel(int currentChannel, int maxChannel, int minChannel) {
        int currentChannel1 = currentChannel-1;

        if (currentChannel1 < minChannel) {
            currentChannel1 = maxChannel;
        }
        return currentChannel1;
    }

    // +1 уровень звука
    public int plusVolume (int currentVolume, int maxVolume, int minVolume) {
        int currentVolume1 = currentVolume+1;

        if (currentVolume1 > maxVolume) {
            currentVolume1 = currentVolume;
        }
        return currentVolume1;
    }

    // -1 уровень звука
    public int minusVolume (int currentVolume, int maxVolume, int minVolume) {
        int currentVolume1 = currentVolume-1;

        if (currentVolume1 < minVolume) {
            currentVolume1 = currentVolume;
        }
        return currentVolume1;
    }
}