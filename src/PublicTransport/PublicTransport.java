package PublicTransport;

public class PublicTransport {
    protected int vehicleNumber;
    protected int fuel = 100;
    protected int speed = 0;
    protected int currentOfPassengers=0;
    protected int maxPassengers;
    protected int remainingPassengers;






    //승객 탑승
    public boolean takePassenger(int passengers) { //추상메서드로 전환
        if(currentOfPassengers+passengers>maxPassengers){
            System.out.println("더이상 탑승할 수 없습니다.");
            return false;
        }
        currentOfPassengers += passengers;
        remainingPassengers = maxPassengers -currentOfPassengers;
        return true;
    }

    //속도 변경
    public void changeSpeed(int speed) {
        this.speed += speed;
    }

    //번호확인
    public void checkNumber(PublicTransport p1, PublicTransport p2) {
        if (p1.vehicleNumber == 0 || p2.vehicleNumber == 0) {
            System.out.println("번호를 생성했는지 확인해주세요.");
        } else if (p1.vehicleNumber == p2.vehicleNumber) {
            System.out.println("번호가 같습니다. 번호를 다시 생성해주세요.");
        } else if (p1.vehicleNumber != p2.vehicleNumber) {
            System.out.println("번호가 다릅니다. 정상입니다.");
        }
    }

    //연료 사용
    public void useFuel(int fuel){
        this.fuel -= fuel;
        }

    //연료 채우기
    public void fillFuel(int fuel){
        this.fuel += fuel;
        if(this.fuel >100){
            System.out.println("주유가 가득 찼습니다.");
            this.fuel=100;
        }
    }
    //연료 확인
    public void checkFuel(){
        System.out.println("현재 주유량 = "+fuel);
        if(fuel<10) {
            System.out.println("경고: 주유가 필요합니다.");
        }
    }



    public int getVehicleNumber() {
        return vehicleNumber;
    }



}





