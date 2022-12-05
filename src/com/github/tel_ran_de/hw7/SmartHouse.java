package com.github.tel_ran_de.hw7;


public class SmartHouse {

    public static void main(String[] args) {
        SmartHouseScanner inps = new SmartHouseScanner();
        int currentTime = 0;
        int currentWeekDay = 0;
        boolean isSignalingOn = false;
        boolean isOwnersAtHome = true;

        //    текущее время (в часах от 0 до 23)
        if (inps.getTimeValue("Enter current time (number 0 - 23):")) {
            currentTime = inps.currentTime;
        } else {
            System.out.println(inps.errorMessage);
            return;
        }

        if (inps.getDayValue("Enter current day of the week (number 0 - 6):")) {
            currentWeekDay = inps.currentWeekDay;
        } else {
            System.out.println(inps.errorMessage);
            return;
        }

        if (inps.getSignalValue("Enter current status of signaling (0 - off or 1 - on):")) {
            isSignalingOn = inps.isSignalingOn;
            isOwnersAtHome = !isSignalingOn;
        } else {
            System.out.println(inps.errorMessage);
            return;
        }

        if (currentWeekDay % 6 != 0) { // будний день
            if (currentTime == 8 && isOwnersAtHome) {             //1) В будний день в 8ч поднять шторы, если хозяева дома (сигнализация отключена)
                SmartHouseHelper.raiseCurtains();
            } else if (currentTime == 20 && !isOwnersAtHome) {              //3) В будний день в 20ч вечера включить чайник, если хозяев нет дома
                SmartHouseHelper.turnOnKettle();
            } else if (currentTime == 23 && SmartHouseHelper.isCurtainsOpen) {            //4) В будний день в 23ч опустить шторы, если шторы были подняты
                SmartHouseHelper.lowerCurtains();
            } else {
                System.out.println("nothing to do");
            }

        } else { // выходной день
            if (currentTime == 11 && isOwnersAtHome) {            //2) В выходной день в 11ч поднять шторы, если хозяева дома
                SmartHouseHelper.raiseCurtains();
            } else {
                System.out.println("nothing to do");
            }
        }





    }

}
