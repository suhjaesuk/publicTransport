import Feature.UniqueRandomNumberMaker;
import PublicTransport.Bus;

public class BusApplication {
    public static void main(String[] args) {
        Bus bus1 = new Bus();
        Bus bus2 = new Bus();

        //랜덤클래스 생성.
        //난수 생성 및 번호 확인
        bus1.setVehicleNumber(UniqueRandomNumberMaker.makeUniqueRandomNumber());
        bus2.setVehicleNumber(UniqueRandomNumberMaker.makeUniqueRandomNumber());
        Bus.checkNumber(bus1,bus2);

        bus1.takePassenger(2);

        //출력 -> 승객 정보와 누적 요금을 출력한다.
        bus1.output1();

        bus1.useFuel(50);
        bus1.checkFuel();

        bus1.changeStatus();
        bus1.fillFuel(10);

        //출력 -> 상태와 주유량을 출력한다.
        bus1.output2();

        bus1.changeStatus();
        bus1.takePassenger(45); //승객수가 30이 넘어갈시 경고문
        bus1.takePassenger(5);

        //출력 -> 탑승 승객수, 잔여 승객수, 누적 요금을 출력한다.
        bus1.output3();

        bus1.useFuel(55);

        //출력 -> 주유량, 상태 출력. 주유량이 10보다 낮으면 경고
        bus1.output4();
    }


}
