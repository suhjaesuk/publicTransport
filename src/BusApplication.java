import PublicTransport.Bus;

public class BusApplication {
    public static void main(String[] args) {
        Bus bus1 = new Bus();
        Bus bus2 = new Bus();
        //난수 생성
        bus1.setVehicleNumber(bus1.makeRandom());
        bus2.setVehicleNumber(bus2.makeRandom());
        System.out.println("bus2.getVehicleNumber() = " + bus2.getVehicleNumber());
        System.out.println("bus1.getVehicleNumber() = " + bus1.getVehicleNumber());
        bus1.checkNumber(bus1,bus2);
        bus1.takePassenger(2);
        bus1.alertCurrentOfPassengers();
        bus1.alertRemainingPassengers();
        bus1.getCheckCosts();
        bus1.useFuel(50);
        bus1.checkFuel();
        bus1.changeStatus();
        bus1.fillFuel(10);
        bus1.alertStatus();
        bus1.checkFuel();
        bus1.changeStatus();
        bus1.takePassenger(45);
        bus1.takePassenger(5);
        bus1.alertCurrentOfPassengers();
        bus1.alertRemainingPassengers();
        bus1.getCheckCosts();
        bus1.useFuel(55);
        bus1.checkFuel();
        bus1.alertStatus();
        bus1.alertNeedFuel();
    }


}
