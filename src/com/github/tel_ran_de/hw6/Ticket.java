package com.github.tel_ran_de.hw6;

import java.util.Random;

public class Ticket {

    String clientName;                  // На кого выписан билет
    String eventName;                   // название мероприятия
    public int ticketCode;              // уникальный номер билета
    public String clientSeatNumber;     // номер места


    public Ticket(String newClient, String newEvent, String seatNumber) {
        clientName = newClient;
        eventName = newEvent;
        clientSeatNumber = seatNumber;

        Random rnd = new Random();
        ticketCode = rnd.nextInt(1000, 10000);
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "clientName='" + clientName + '\'' +
                ", eventName='" + eventName + '\'' +
                ", ticketCode=" + ticketCode +
                ", clientSeatNumber='" + clientSeatNumber + '\'' +
                '}';
    }
}
