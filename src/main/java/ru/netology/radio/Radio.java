package ru.netology.radio;

public class Radio {

    private int currentStation;

    public int getCurrentStation() {
        return currentStation;
    }

    public int minStation = 0;
    public int maxStation = 9;

    private int currentVolume;

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int minVolume = 0;
    public int maxVolume = 10;

    public void setCurrentStation(int newCurrentStation) {

        if (newCurrentStation < minStation) {
            return;
        }
        if (newCurrentStation > maxStation) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < minVolume) {
            return;
        }
        if (newCurrentVolume > maxVolume) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void setPrevStation() {
        if (currentStation > minStation) {
            currentStation = currentStation - 1;
        }
        else currentStation = maxStation;
    }

    public void setNextStation() {
        if (currentStation < maxStation) {
            currentStation = currentStation + 1;
        }
        else currentStation = minStation;
    }

    public void setVolumeUp() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        }
        else currentVolume = maxVolume;
    }

    public void setVolumeDown() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        }
        else currentVolume = minVolume;
    }
}
