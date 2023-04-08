package ru.netology;

public class Radio {
    private int amountRadioStation = 10;
    private int maxRadioStation = amountRadioStation - 1;
    private int minRadioStation = 0;
    private int currentRadioStation;
    private int maxVolume = 100;
    private int minVolume = 0;
    private int currentVolume;

    public Radio(int amountRadioStation) {
        this.amountRadioStation = amountRadioStation;
    }

    public Radio() {
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int newRadioStation) {
        if (newRadioStation < minRadioStation) {
            return;
        }
        if (newRadioStation > maxRadioStation) {
            return;
        }
        currentRadioStation = newRadioStation;
    }

    public void next() {
        if (currentRadioStation == maxRadioStation) {
            currentRadioStation = minRadioStation;
        } else {
            currentRadioStation++;
        }
    }

    public void prev() {
        if (currentRadioStation == minRadioStation) {
            currentRadioStation = maxRadioStation;
        } else {
            currentRadioStation--;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setVolume(int newVolume) {
        if (newVolume < minVolume) {
            return;
        }
        if (newVolume > maxVolume) {
            return;
        }
        currentVolume = newVolume;
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume++;
        }
    }

    public void reduceVolume() {
        if (currentVolume > minVolume) {
            currentVolume--;
        }
    }
}