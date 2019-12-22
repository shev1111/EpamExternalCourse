package projects.project1.model.entity;
import java.time.LocalDateTime;

public class Ticket {
    private final int ticketID;
    private final String from;
    private final String to;
    private final LocalDateTime dateArrive;
    private final LocalDateTime dateDeparture;
    private final String waggon;
    private final String train;
    private final int trainID;
    private final int waggonNumber;
    private final int place;

    private Ticket(int ticketID, String from, String to,
                   LocalDateTime dateArrive, LocalDateTime dateDeparture,
                   String waggon, String train, int trainID,
                   int waggonNumber, int place) {
        this.ticketID = ticketID;
        this.from = from;
        this.to = to;
        this.dateArrive = dateArrive;
        this.dateDeparture = dateDeparture;
        this.train = train;
        this.waggon = waggon;
        this.trainID = trainID;
        this.waggonNumber = waggonNumber;
        this.place = place;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public LocalDateTime getDateArrive() {
        return dateArrive;
    }

    public LocalDateTime getDateDeparture() {
        return dateDeparture;
    }

    public int getTrainID() {
        return trainID;
    }

    public String getTrain() {
        return train;
    }

    public String getWaggon() {
        return waggon;
    }

    public int getWaggonNumber() {
        return waggonNumber;
    }

    public int getPlace() {
        return place;
    }

    public static Builder newTicket() {
        return new Builder();
    }

    public static class Builder {
        private int ticketID;
        private String from;
        private String to;
        private LocalDateTime dateArrive;
        private LocalDateTime dateDeparture;
        private String train;
        private String waggon;
        private int trainID;
        private int waggonNumber;
        private int place;

        public Builder ticketID(int ticketID) {
            this.ticketID = ticketID;
            return this;
        }

        public Builder from(String from) {
            this.from = from;
            return this;
        }

        public Builder to(String to) {
            this.to = to;
            return this;
        }

        public Builder dateArrive(LocalDateTime date) {
            this.dateArrive = date;
            return this;
        }

        public Builder dateDeparture(LocalDateTime date) {
            this.dateDeparture = date;
            return this;
        }

        public Builder train(String train) {
            this.train = train;
            return this;
        }

        public Builder trainID(int trainID) {
            this.trainID = trainID;
            return this;
        }

        public Builder waggon(String waggon) {
            this.waggon = waggon;
            return this;
        }

        public Builder waggonNumber(int waggonNumber) {
            this.waggonNumber = waggonNumber;
            return this;
        }

        public Builder place(int place) {
            this.place = place;
            return this;
        }

        public Ticket build() {
            return new Ticket(ticketID,
                    from, to, dateArrive,
                    dateDeparture, waggon,
                    train, trainID,
                    waggonNumber, place
            );
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Ticket ticket = (Ticket) o;

        if (ticketID != ticket.ticketID) return false;
        if (trainID != ticket.trainID) return false;
        if (waggonNumber != ticket.waggonNumber) return false;
        if (place != ticket.place) return false;
        if (!from.equals(ticket.from)) return false;
        if (!to.equals(ticket.to)) return false;
        if (!dateArrive.equals(ticket.dateArrive)) return false;
        if (!dateDeparture.equals(ticket.dateDeparture)) return false;
        if (!waggon.equals(ticket.waggon)) return false;
        return train.equals(ticket.train);
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result+ticketID;
        result = 31 * result + from.hashCode();
        result = 31 * result + to.hashCode();
        result = 31 * result + dateArrive.hashCode();
        result = 31 * result + dateDeparture.hashCode();
        result = 31 * result + waggon.hashCode();
        result = 31 * result + train.hashCode();
        result = 31 * result + trainID;
        result = 31 * result + waggonNumber;
        result = 31 * result + place;
        return result;
    }
}
