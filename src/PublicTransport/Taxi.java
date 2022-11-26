package PublicTransport;

public class Taxi extends PublicTransport {

    private int defaultDistance = 1;
    private int distantPerCosts = 1000;
    private int checkCosts; //최종적으로 지불할 요금
    private String destination;
    private int distant;

    @Override
    public void start() {status = "일반";}
    @Override
    public void end() {status = "탑승불가";}

    //승객 탑승 : 승객의 수 입력
    @Override
    public boolean takePassenger(int passengers) {
        currentOfPassengers = 0;
        if (passengers > maxPassengers) {
            System.out.println("최대 승객 수 초과.");
            return false;
        }
        status = "운행중";
        currentOfPassengers = passengers;
        remainingPassengers = maxPassengers - passengers;
        return true;
    }

    //목적지로 이동. 목적지와 거리를 매개변수로 받는다.
    public void toDestination(String destination, int distant) {
        this.destination = destination;
        this.distant = distant;
        checkCosts = distantPerCosts * (distant - defaultDistance) + defaultCosts;
    }

    //최종 요금 결제
    public void pay() {
        status = "일반";
        checkAllCosts += checkCosts;
    }

    @Override
    public void checkFuel() {
        super.checkFuel();
        if (this.fuel < 10) {
            status = "탑승 불가";
        }
    }

    public Taxi() {
        this.maxPassengers = 4;
        this.defaultCosts = 3000;
        this.status = "일반";
    }


    //정보를 출력하는 함수 6개
    public void alertDistant() {
        System.out.println("목적지까지 거리 = " + distant + "km");
    }

    public void alertDestination() {
        System.out.println("목적지 = " + destination);
    }

    public void alertDefaultCosts() {
        System.out.println("기본 요금 확인 = " + defaultCosts);
    }

    public void alertCheckCosts() {
        System.out.println("지불할 요금 = " + checkCosts);
    }

    public void alertCheckSumCosts() {
        System.out.println("누적 요금 = " + checkAllCosts);
    }
    @Override
    public void alertStatus() {
        System.out.println("상태 = " + status);
    }


    //output1~5() : 택시 어플리케이션 출력함수
    public void output1() {
        checkFuel();
        alertStatus();
        distinguishLine();
    }

    public void output2() {
        alertPassengers();
        alertDestination();
        alertDistant();
        alertDefaultCosts();
        alertCheckCosts();
        alertStatus();
        distinguishLine();
    }

    public void output3() {
        alertFuel();
        alertCheckSumCosts();
        distinguishLine();
    }

    public void output4() {
        alertPassengers();
        alertDefaultCosts();
        alertDestination();
        alertDistant();
        alertCheckCosts();
        distinguishLine();
    }

    public void output5() {
        checkFuel();
        alertStatus();
        alertCheckSumCosts();
        alertNeedFuel();
        distinguishLine();
    }


}
