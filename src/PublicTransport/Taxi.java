package PublicTransport;

public class Taxi extends PublicTransport{
    private String status = "일반";
    private int maxPassengers = 4;
    private int defaultCosts=3000;
    private int  defaultDistance=1;
    private int distantPerCosts = 1000;
    private int checkCosts;
    private int checkSumCosts;
    private String destination;
    private int distant;


    public boolean takePassenger(int passengers){
        currentOfPassengers=0;
        if(passengers>maxPassengers){
            System.out.println("최대 승객 수 초과.");
            return false;
        }
        status="운행중";
        currentOfPassengers=passengers;
        remainingPassengers=maxPassengers-passengers;
        return true;
    }
    public void toDestination(String destination, int distant){
        this.destination=destination;
        this.distant=distant;
        checkCosts= distantPerCosts *(distant-defaultDistance) + defaultCosts;
        checkSumCosts +=checkCosts;
    }


    @Override
    public void checkFuel() {
        super.checkFuel();
        if(this.fuel<10){
            status="운행불가";
        }
    }

    public String getStatus() {
        System.out.println("상태 = "+status);
        return status;
    }

    public Taxi(int vehicleNumber){
    this.vehicleNumber=vehicleNumber;
}


    public int getDistant() {
        System.out.println("목적지까지 거리 = "+distant +"km");
        return distant;
    }

    public String getDestination() {
        System.out.println("목적지 = "+destination);
        return destination;
    }

    public int getDefaultCosts() {
        System.out.println("기본 요금 확인 = "+defaultCosts);
        return defaultCosts;
    }

    public int getCheckCosts() {
        System.out.println("지불할 요금 = "+checkCosts);
        return checkCosts;
    }

    public int getCheckSumCosts() {
        System.out.println("누적 요금 = "+ checkSumCosts);
        return checkSumCosts;
    }
    public int getFuel() {
        System.out.println("주유량 = "+fuel);
        return fuel;
    }
    public int getCurrentOfPassengers() {
        System.out.println("탑승 승객 수 = "+currentOfPassengers);
        return currentOfPassengers;
    }

    public int getRemainingPassengers() {
        System.out.println("잔여 승객 수 = "+remainingPassengers);
        return remainingPassengers;
    }
}
