package ru.netology.radioV2;

public class Radio {
    private int maxChannel = 9;
    private int minChannel = 0;
    private int maxVolume = 10;
    private int minVolume = 0;
    private int currentChannel = 5;
    private int currentVolume = 7;
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
        this.currentChannel = currentChannel;
    }

    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }


    public static void main(String[] args) {
        Radio radio = new Radio();
        int currentChannel1 = radio.SelectionChannel(radio.getCurrentChannel(), radio.getMaxChannel(), radio.getMinChannel());
        int currentVolume1 = radio.SelectionVolume(radio.getCurrentVolume(), radio.getMaxVolume(), radio.getMinVolume());
        radio.setCurrentChannel(currentChannel1);
        radio.setCurrentVolume(currentVolume1);

        System.out.println("Выбран радиоканал № " + radio.getCurrentChannel());
        System.out.println("Установлен уровень звука - " + radio.getCurrentVolume());

    }


    // выбор радиоканала
    public int SelectionChannel(int currentChannel, int maxChannel, int minChannel) {
        int currentChannel1 = currentChannel;
        // если пользователь выбрал канал, следующим за 9-м (максимальным),
        // то присваиваем переменной currentChannel минимальное значение
        if (currentChannel > maxChannel) {
            currentChannel1 = minChannel;
        }
        // если пользователь выбрал канал, предстоящим перед 0-м (минимальным),
        // то присваиваем переменной currentChannel максимальное значение
        if (currentChannel < minChannel) {
            currentChannel1 = maxChannel;
        }
        return currentChannel1;
    }

    // регулировка громкости
    public int SelectionVolume(int currentVolume, int maxVolume, int minVolume) {
        int currentVolume1 = currentVolume;

        // если пользователь выбрал уровень звука выше максимального, то оставляем максимальное значение
        if (currentVolume > maxVolume) {
            currentVolume1 = maxVolume;
        }

        // если пользователь выбрал уровень звука ниже минимального, то оставляем минимальное значение
        if (currentVolume < minVolume) {
            currentVolume1 = minVolume;
        }

        return currentVolume1;
    }
}