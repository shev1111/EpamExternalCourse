package projects.project1.model.entity;

import java.util.ArrayList;
import java.util.List;

public class Passenger {
    private final int PASSENGER_ID;
    private final String NAME;
    private List<Item> items;
    private Ticket ticket;

    public Passenger(String name, int passengerID) {
        this.NAME = name;
        this.PASSENGER_ID = passengerID;
        this.items = new ArrayList<>();
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public Item getItem(int index) {
        return items.get(index);
    }

    public void addItem(Item element) {
        items.add(element);
    }

    public Item removeItem(int index) {
        return items.remove(index);
    }

    public int getBaggageWeight() {
        int weight = 0;
        for (Item item : items) {
            weight += item.getWEIGHT();
        }
        return weight;
    }

    public String getName() {
        return NAME;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public int getPassengerID() {
        return PASSENGER_ID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Passenger passenger = (Passenger) o;

        if (PASSENGER_ID != passenger.PASSENGER_ID) return false;
        if (!NAME.equals(passenger.NAME)) return false;
        if (items != null ? !items.equals(passenger.items) : passenger.items != null) return false;
        return ticket != null ? ticket.equals(passenger.ticket) : passenger.ticket == null;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + PASSENGER_ID;
        result = 31 * result + NAME.hashCode();
        result = 31 * result + (items != null ? items.hashCode() : 0);
        result = 31 * result + (ticket != null ? ticket.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "PASSENGER_ID=" + PASSENGER_ID +
                ", NAME='" + NAME + '\'' +
                ", items=" + items +
                ", ticket=" + ticket +
                '}';
    }
}
