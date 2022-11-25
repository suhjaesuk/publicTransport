package PublicTransport;

public class Bus extends PublicTransport {

    private int maxPassengers = 30;

    private int costs = 1000;
    private int checkCosts;
    private String status = "운행";

    //상태 변경
    public void changeStatus(){
        if(status.equals("운행")){
            status="차고지행";
            remainingPassengers=0;
            checkCosts=0;
            currentOfPassengers=0;
        }else{
            status="운행";
        }
    }

    @Override
    public void useFuel(int fuel) {
        super.useFuel(fuel);
        if(this.fuel <10){
            status="차고지행";
        }
    }



    public boolean takePassenger(int passengers){
        if(currentOfPassengers+passengers>maxPassengers){
            System.out.println("최대 승객 수 초과.");
            return false;
        }
        currentOfPassengers+=passengers;
        remainingPassengers=maxPassengers-passengers;
        checkCosts= costs*passengers+checkCosts;
        return true;
    }
    public Bus(int vehicleNumber){
        this.vehicleNumber=vehicleNumber;
    }


    public int getCheckCosts() {
        System.out.println("요금 확인 = "+checkCosts);
        return checkCosts;
    }

    public String getStatus() {
        System.out.println("상태 = "+status);
        return status;
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