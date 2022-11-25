import PublicTransport.Taxi;

public class TaxiApplication {
    public static void main(String[] args) {
        Taxi taxi1 = new Taxi(1000);
        Taxi taxi2 = new Taxi(2000);
        taxi1.checkNumber(taxi1, taxi2);
        taxi1.checkFuel();
        taxi1.getStatus();
        taxi1.takePassenger(2);
        taxi1.toDestination("서울역",2);
        taxi1.getCurrentOfPassengers();
        taxi1.getRemainingPassengers();
        taxi1.getDestination();
        taxi1.getDistant();
        taxi1.getDefaultCosts();
        taxi1.getDestination();
        taxi1.getDistant();
        taxi1.getCheckCosts();
        taxi1.getStatus();
        taxi1.useFuel(80);
        //요금결제
        taxi1.getFuel();
        taxi1.getCheckSumCosts();
        taxi1.takePassenger(5);
        taxi1.takePassenger(3);
        taxi1.toDestination("구로디지털단지역", 12);
        taxi1.getCurrentOfPassengers();
        taxi1.getRemainingPassengers();
        taxi1.getDefaultCosts();
        taxi1.getDestination();
        taxi1.getDistant();
        taxi1.getCheckCosts();
        taxi1.useFuel(20);
        //요금결제
        taxi1.checkFuel();
        taxi1.getStatus();
        taxi1.getCheckSumCosts();

    }

}
