import PublicTransport.Bus;

public class BusApplication {
    public static void main(String[] args) {
        Bus bus1 = new Bus(3000);
        Bus bus2 = new Bus(3001);
        bus1.checkNumber(bus1,bus2);

        bus1.takePassenger(2);
        bus1.getCurrentOfPassengers();
        bus1.getRemainingPassengers();
        bus1.getCheckCosts();
        bus1.useFuel(50);
        bus1.checkFuel();
        bus1.changeStatus();
        bus1.fillFuel(10);
        bus1.getStatus();
        bus1.checkFuel();
        bus1.changeStatus();
        bus1.takePassenger(45);
        bus1.takePassenger(5);
        bus1.getCurrentOfPassengers();
        bus1.getRemainingPassengers();
        bus1.getCheckCosts();
        bus1.useFuel(55);
        bus1.checkFuel();
        bus1.getStatus();
    }


}