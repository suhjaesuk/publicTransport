package PublicTransport;
public abstract class PublicTransport {
    protected String status; //기본생성자에 생성
    protected int vehicleNumber;

    protected int fuel = 100;
    protected int speed = 0;
    protected int defaultCost;

    protected int accumulatedCost; //checkAllCost안좋은 네이밍.

    protected int currentPassengerCount = 0;

    protected int maxPassengerCount;

    protected int remainingPassengerCount;

    //운행 시작
    abstract void start();
    //운행 종료
    abstract void end();

    //승객 탑승
    abstract boolean takePassenger(int passengers);

    //상태를 출력하는 함수
    abstract void alertStatus();

    public void changeSpeed(int speed) {
        this.speed += speed;
    }

    //abstract 따로 구현
    public static void checkNumber(PublicTransport p1, PublicTransport p2) {
        if (p1.vehicleNumber == 0 || p2.vehicleNumber == 0) {
            System.out.println("번호를 생성했는지 확인해주세요.");
        } else if (p1.vehicleNumber == p2.vehicleNumber) {
            System.out.println("번호가 같습니다. 번호를 다시 생성해주세요.");
        } else if (p1.vehicleNumber != p2.vehicleNumber) {
            System.out.println("번호가 다릅니다. 정상입니다.");
        }
    }

    //연료 사용 제약조건 추가할것 int>0
    public void useFuel(int fuel) {
        this.fuel -= fuel;
    }

    //연료 채우기
    public void fillFuel(int fuel) {
        this.fuel += fuel;
        if (this.fuel > 100) {
            System.out.println("주유가 가득 찼습니다.");
            this.fuel = 100;
        }
    }

    //정보를 출력하는 함수 6개
    public void checkFuel() {
        System.out.println("현재 주유량 = " + this.fuel);
    }

    public void alertFuel() {
        System.out.println("주유량 = " + this.fuel);
    }

    public void alertPassengers() {
        System.out.println("탑승 승객 수 = " + this.currentPassengerCount + "\n" + "잔여 승객 수 = " + this.remainingPassengerCount);
    }

    public void alertRemainingPassengers() {
        System.out.println("잔여 승객 수 = " + this.remainingPassengerCount);
    }

    public void alertNeedFuel() {
        if (this.fuel < 10) {
            System.out.println("경고 : 주유가 필요합니다.");
        }
    }

    public void distinguishLine() {
        System.out.println("------------------------------");
    }

    //차량번호 필드 setter -> 난수 생성 시 필요
    public void setVehicleNumber(int vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }
    public int getVehicleNumber() { return this.vehicleNumber; }
}






