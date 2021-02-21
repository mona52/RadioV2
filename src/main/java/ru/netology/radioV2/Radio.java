package ru.netology.radioV2;

public class Radio {
    private int maxChannel = 9;
    private int minChannel = 0;
    private int maxVolume = 100;
    private int minVolume = 0;
    private int currentChannel;
    private int currentVolume;

    public Radio(int currentChannel, int currentVolume) {
        this.currentChannel = currentChannel;
        this.currentVolume = currentVolume;
    }


    public Radio() {
    }



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
        Radio radio = new Radio(5,7);

        radio.plusChannel();
        System.out.println("Выбран радиоканал № " + radio.getCurrentChannel());

        radio.minusChannel();
        System.out.println("Выбран радиоканал № " + radio.getCurrentChannel());

        radio.plusVolume();
        System.out.println("Установлен уровень звука - " + radio.getCurrentVolume());

        radio.minusVolume();
        System.out.println("Установлен уровень звука - " + radio.getCurrentVolume());
    }


    // +1 радиоканал
    public void plusChannel() {
        if (getCurrentChannel() >= maxChannel) {
            setCurrentChannel(minChannel);
        } else {
            setCurrentChannel(getCurrentChannel() + 1);
        }
    }

    // -1 радиоканал
    public void minusChannel() {
        if (getCurrentChannel() <= minChannel) {
            setCurrentChannel(maxChannel);
        } else {
            setCurrentChannel(getCurrentChannel() - 1);
        }
    }

    // +1 уровень звука
    public void plusVolume() {
        if (getCurrentVolume() >= maxVolume) {
            setCurrentVolume(maxVolume);
        } else {
            setCurrentVolume(getCurrentVolume() + 1);
        }
    }


    // -1 уровень звука
    public void minusVolume() {
        if (getCurrentVolume() <= minVolume) {
            setCurrentVolume(minVolume);
        } else {
            setCurrentVolume(getCurrentVolume() - 1);
        }
    }
}
