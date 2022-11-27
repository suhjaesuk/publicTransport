package PublicTransport;

public class Bus extends PublicTransport{
    @Override               //상태값은 Enum으로 관리 상태가 가변적이면 String으로 사용
    public void start() {
        this.status = "운행";
    } //this 붙일것
    @Override
    public void end() {this.status = "차고지행";}

    //상태 변경
    public void changeStatus() {
        if (this.status.equals("운행")) {
            this.status = "차고지행";
            this.remainingPassengerCount = 0;
            this.accumulatedCost = 0;
            this.currentPassengerCount = 0;
        } else {
            this.status = "운행";
        }
    }
    @Override
    public void useFuel(int fuel) {
        super.useFuel(fuel);
        if (this.fuel < 10) {
            this.status = "차고지행";
        }
    }
    //승객 탑승
    @Override
    public boolean takePassenger(int passengers) {
        if (this.currentPassengerCount + passengers > this.maxPassengerCount) {
            System.out.println("최대 승객 수 초과.");
            return false;
        }
        this.currentPassengerCount += passengers;
        this.remainingPassengerCount = this.maxPassengerCount - this.currentPassengerCount;
        this.accumulatedCost = this.defaultCost * passengers + this.accumulatedCost;
        return true;
    }

    public Bus() {
//        this.status= String.valueOf(Status.운행);
        this.maxPassengerCount = 30;
        this.status = "운행";
        this.defaultCost = 1000;
    }

    //정보를 출력하는 함수 2개
    public void getCheckCosts() {
        System.out.println("요금 확인 = " + this.accumulatedCost);
    }

    @Override
    public void alertStatus() {
        System.out.println("상태 = " + this.status);
    }


    //output1~4() : 버스 어플리케이션 출력함수
    public void output1() {
        alertPassengers();
        getCheckCosts();
        distinguishLine();
    }

    public void output2() {
        alertStatus();
        checkFuel();
        distinguishLine();
    }

    public void output3() {
        alertPassengers();
        getCheckCosts();
        distinguishLine();
    }

    public void output4() {
        checkFuel();
        alertStatus();
        alertNeedFuel();
        distinguishLine();
    }
}

