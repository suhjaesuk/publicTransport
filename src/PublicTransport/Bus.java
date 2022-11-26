package PublicTransport;

public class Bus extends PublicTransport {

    @Override
    public void start() {
        status = "운행";
    }
    @Override
    public void end() {status = "차고지행";}

    //상태 변경
    public void changeStatus() {
        if (status.equals("운행")) {
            status = "차고지행";
            remainingPassengers = 0;
            checkAllCosts = 0;
            currentOfPassengers = 0;
        } else {
            status = "운행";
        }
    }

    @Override
    public void useFuel(int fuel) {
        super.useFuel(fuel);
        if (this.fuel < 10) {
            status = "차고지행";
        }
    }
    @Override
    public boolean takePassenger(int passengers) {
        if (currentOfPassengers + passengers > maxPassengers) {
            System.out.println("최대 승객 수 초과.");
            return false;
        }
        currentOfPassengers += passengers;
        remainingPassengers = maxPassengers - currentOfPassengers;
        checkAllCosts = defaultCosts * passengers + checkAllCosts;
        return true;
    }

    public Bus() {
        this.maxPassengers = 30;
        this.status = "운행";
        this.defaultCosts = 1000;
    }

    //정보를 출력하는 함수 2개
    public int getCheckCosts() {
        System.out.println("요금 확인 = " + checkAllCosts);
        return checkAllCosts;
    }

    @Override
    public void alertStatus() {
        System.out.println("상태 = " + status);
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

