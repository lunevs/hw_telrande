package com.github.tel_ran_de.lesson9;

import java.time.LocalDate;
import java.time.DayOfWeek;

public class CurrentDayOfWeek {
    public static void main(String[] args) {

        String[] weekDays = new String[7];
        for (int i=0; i<weekDays.length; i++) {
            LocalDate curDt = LocalDate.of(2022, 12, 5 + i);
            DayOfWeek day = curDt.getDayOfWeek();
            weekDays[i] = day.name().toLowerCase();
        }

        for (int i=0; i<weekDays.length; i++) {
            System.out.println("weekDays[" + i + "] = " + weekDays[i]);
        }
    }
}
