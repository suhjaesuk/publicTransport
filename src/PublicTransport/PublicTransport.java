package PublicTransport;

import java.util.ArrayList;

public abstract class PublicTransport {
    public static ArrayList<Integer> list = new ArrayList<Integer>();
    protected String status ="";
    protected int vehicleNumber;

    protected int fuel = 100;
    protected int speed = 0;
    protected int currentOfPassengers=0;
    protected int maxPassengers; //필요한가 고민중.. 자식 클래스에 들어가지만 자식클래스에서 재정의를 해줘야한다. 이 클래스에서 안쓰인다.
    protected int remainingPassengers;

    //운행 시작
    abstract void start();
    //운행 종료
    abstract void end();
    //승객 탑승
    void takePassenger(){}; //오버라이드로 그냥 이용
    abstract void alertStatus();
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
    }




    public void alertFuel() {
        System.out.println("주유량 = "+fuel);
    }
    public void alertCurrentOfPassengers() {
        System.out.println("탑승 승객 수 = "+currentOfPassengers);
    }

    public void alertRemainingPassengers() {
        System.out.println("잔여 승객 수 = "+remainingPassengers);
    }

    public void alertNeedFuel(){
        if(fuel<10) {
            System.out.println("경고 : 주유가 필요합니다.");
        }
    }

    public int getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(int vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    //랜덤번호 부여
    public int makeRandom() {
        int r;
        while (true) {
            boolean check = true;
            r = (int) (Math.random() * 100) + 1;
            if (list.contains(r)) check = false;
            if (check) {
                list.add(r);
                break;
            }
        }
        return r;
    }
}





