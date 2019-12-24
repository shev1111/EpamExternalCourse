package projects.project1.model.entity;


import projects.project1.model.entity.enums.ComfortLevel;
import projects.project1.model.entity.interfaces.RailConst;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class PassengerWaggon extends RailTransport {
    private int numberOfSeats;
    private ComfortLevel comfort;
    private List<Passenger> passengers;

    private PassengerWaggon() {
        passengers = new ArrayList<>();
    }

    public static WagonBuilder newPassengerWaggon() {
        return new PassengerWaggon().new WagonBuilder();
    }

    public class WagonBuilder extends RailTransport.BuilderBase<WagonBuilder> {

        public WagonBuilder numberOfSeats(int numberOfSeats) {
            PassengerWaggon.this.numberOfSeats = numberOfSeats;
            return this;
        }

        public WagonBuilder comfort(ComfortLevel comfort) {
            PassengerWaggon.this.comfort = comfort;
            return this;
        }

        @Override
        WagonBuilder This() {
            return this;
        }

        @Override
        public PassengerWaggon build() {
            return PassengerWaggon.this;
        }
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public ComfortLevel getComfort() {
        return comfort;
    }

    public int getCountPassengers() {
        return passengers.size();
    }

    public List<Passenger> getPassengers() {
        return passengers;
    }

    public void addPassenger(Passenger p) {
        if(!(passengers.size() >= numberOfSeats)) passengers.add(p);
    }

    public static PassengerWaggon isPassenger(RailTransport rt) {
        if (rt.getClass().getSimpleName().equals(PassengerWaggon.class.getSimpleName())) {
            return (PassengerWaggon) rt;
        }
        return null;
    }

    @Override
    public String getIdentifierName() {
        return getIndexNumber() + "/" + getName() + "-" + comfort.toString();
    }

    @Override
    public int capacity() {
        return RailConst.PASSENGER_LOAD_CAPACITY;
    }

    public static ComfortComparator comfortComparator() {
        return new ComfortComparator();
    }

    public static class ComfortComparator implements Comparator<RailTransport> {
        @Override
        public int compare(RailTransport o1, RailTransport o2) {
            PassengerWaggon pw1 = (PassengerWaggon) o1;
            PassengerWaggon pw2 = (PassengerWaggon) o2;
            if (pw1.comfort == pw2.comfort) return 0;
            int dif = pw1.comfort.ordinal() - pw2.comfort.ordinal();
            return dif / (Math.abs(dif));
        }
    }

    @Override
    public String toString() {

        return super.toString()+", identifier ='"+getIdentifierName()+"'";
    }
}
