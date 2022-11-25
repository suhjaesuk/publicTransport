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

    public void start(){
        status="일반";
    }

    public void end(){
        status="탑승불가";
    }
    //승객 탑승 : 승객의 수 입력
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
    //목적지로 이동 : 목적지, 거리 입력
    public void toDestination(String destination, int distant){
        this.destination=destination;
        this.distant=distant;
        checkCosts= distantPerCosts *(distant-defaultDistance) + defaultCosts;
    }
    //요금 결제
    public void pay(){
        status="일반";
        checkSumCosts +=checkCosts;
    }

    @Override
    public void checkFuel() {
        super.checkFuel();
        if(this.fuel<10) {
            status = "탑승 불가";
        }
    }

    public Taxi(int vehicleNumber){
    this.vehicleNumber=vehicleNumber;
}


    public void alertDistant() {
        System.out.println("목적지까지 거리 = "+distant +"km");
    }

    public void alertDestination() {
        System.out.println("목적지 = "+destination);
    }

    public void alertDefaultCosts() {
        System.out.println("기본 요금 확인 = "+defaultCosts);
    }

    public void alertCheckCosts() {
        System.out.println("지불할 요금 = "+checkCosts);
    }

    public void alertCheckSumCosts() {
        System.out.println("누적 요금 = "+ checkSumCosts);;
    }

    @Override
    public void alertStatus() {
        System.out.println("상태 = "+status);
    }
}
