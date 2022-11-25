import PublicTransport.Taxi;

public class TaxiApplication {
    public static void main(String[] args) {
        Taxi taxi1 = new Taxi(1000);
        Taxi taxi2 = new Taxi(2000);
        taxi1.checkNumber(taxi1, taxi2);
        taxi1.checkFuel();
        taxi1.alertStatus();
        taxi1.takePassenger(2);
        taxi1.toDestination("서울역",2);
        taxi1.alertCurrentOfPassengers();
        taxi1.alertRemainingPassengers();
        taxi1.alertDestination();
        taxi1.alertDistant();
        taxi1.alertDefaultCosts();
        taxi1.alertDestination();
        taxi1.alertDistant();
        taxi1.alertCheckCosts();
        taxi1.alertStatus();
        taxi1.useFuel(80);
        taxi1.pay();
        taxi1.alertFuel();
        taxi1.alertCheckSumCosts();
        taxi1.takePassenger(5);
        taxi1.takePassenger(3);
        taxi1.toDestination("구로디지털단지역", 12);
        taxi1.alertCurrentOfPassengers();
        taxi1.alertRemainingPassengers();
        taxi1.alertDefaultCosts();
        taxi1.alertDestination();
        taxi1.alertDistant();
        taxi1.alertCheckCosts();
        taxi1.useFuel(20);
        taxi1.pay();
        taxi1.checkFuel();
        taxi1.alertStatus();
        taxi1.alertCheckSumCosts();
        taxi1.alertNeedFuel();

    }

}
