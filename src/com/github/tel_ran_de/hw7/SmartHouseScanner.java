package com.github.tel_ran_de.hw7;

import java.util.Scanner;

public class SmartHouseScanner {
    private static Scanner scanner;

    public int currentTime;
    public int currentWeekDay;
    public boolean isSignalingOn;
    public String errorMessage;

    public SmartHouseScanner() {
        scanner = new Scanner(System.in);
    }

    public boolean getTimeValue(String message) {
        System.out.println(message);
        try {
            int curTime = scanner.nextInt();
            if (curTime >= 0 && curTime < 24) {
                currentTime = curTime;
                return true;
            } else {
                errorMessage = "некоректный диапазон времени";
                return false;
            }
        } catch (Exception e) {
            errorMessage = "Ошибка ввода данных текущего времени, попробуйте еще раз";
            return false;
        }
    }

    public boolean getDayValue(String message) {
        System.out.println(message);
        try {
            int curDay = scanner.nextInt();
            if (curDay >= 0 && curDay < 7) {
                currentWeekDay = curDay;
                return true;
            } else {
                errorMessage = "некоректный диапазон дня недели";
                return false;
            }
        } catch (Exception e) {
            errorMessage = "Ошибка ввода данных дня недели, попробуйте еще раз";
            return false;
        }
    }

    public boolean getSignalValue(String message) {
        System.out.println(message);
        try {
            int signalStatus = scanner.nextInt();
            if (signalStatus == 0) {
                isSignalingOn = false;
                return true;
            } else if (signalStatus == 1) {
                isSignalingOn = true;
                return true;
            } else {
                errorMessage = "некоректное значение статуса сигнализации";
                return false;
            }
        } catch (Exception e) {
            errorMessage = "Ошибка ввода данных статуса сигнализации, попробуйте еще раз";
            return false;
        }
    }

}
