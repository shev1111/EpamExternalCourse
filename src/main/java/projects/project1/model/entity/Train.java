package projects.project1.model.entity;

import projects.project1.model.entity.interfaces.Traction;
import java.util.List;

public final class Train {
    private static int quantity;
    private  int idTrain=1;
    private RailTransport head;
    private RailTransport tail;
    private List<RailTransport> waggons;

    public Train(RailTransport tr, List<RailTransport> waggons) {
        if(!isTraction(tr)){
            this.head = tr;
        }
        this.waggons = waggons;

    }

    public Train(RailTransport head, RailTransport tail, List<RailTransport> waggons) {
        this(head, waggons);
        this.tail = tail;
    }

    private boolean isTraction(RailTransport rt) {
        return rt instanceof Traction;
    }

    public static int numberOfTrains() {
        return quantity;
    }

    public int getIdTrain() {
        return idTrain;
    }

    public RailTransport getHead() {
        return head;
    }

    public void setHead(RailTransport head) {
        this.head = head;
    }

    public RailTransport getTail() {
        return tail;
    }

    public void setTail(RailTransport tail) {
        this.tail = tail;
    }

    public List<RailTransport> getWaggons() {
        return waggons;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Train train = (Train) o;

        if (idTrain != train.idTrain) return false;
        if (head != null ? !head.equals(train.head) : train.head != null) return false;
        if (tail != null ? !tail.equals(train.tail) : train.tail != null) return false;
        return waggons != null ? waggons.equals(train.waggons) : train.waggons == null;
    }

    @Override
    public int hashCode() {
        int result = idTrain;
        result = 31 * result + (head != null ? head.hashCode() : 0);
        result = 31 * result + (tail != null ? tail.hashCode() : 0);
        result = 31 * result + (waggons != null ? waggons.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Train №: " + idTrain +
                "\nTraction: " + head.toString() +
                "\nNumber of waggons: " + waggons.size();
    }
}
