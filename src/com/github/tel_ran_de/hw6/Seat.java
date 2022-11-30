package com.github.tel_ran_de.hw6;

public class Seat {

    boolean isBooked;               // Признак Занятости
    String seatNumber;              // порядковый Номер
    Ticket currentTicket;           // билет выписанный на это место

    public Seat(String seatNumber) {
        this.seatNumber = seatNumber;
        isBooked = false;
    }

    // Класс Seat реализует метод book(), содержащий логику бронирования этого места и создающий новый объект Ticket
    public Ticket book(String clientName, String eventName) {
        this.isBooked = true;
        currentTicket = new Ticket(clientName, eventName, seatNumber);
        System.out.println(currentTicket);                                  // почему-то если через return пытаюсь вернуть билет, то ругается в классе Main
        return currentTicket;
    }

    @Override
    public String toString() {
        return "Seat{" +
                "isBooked=" + isBooked +
                ", seatNumber='" + seatNumber + '\'' +
                '}';
    }
}
