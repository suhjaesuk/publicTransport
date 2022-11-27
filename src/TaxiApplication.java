import Feature.UniqueRandomNumberMaker;
import PublicTransport.Taxi;

public class TaxiApplication {
    public static void main(String[] args) {
        Taxi taxi1 = new Taxi();
        Taxi taxi2 = new Taxi();

        //난수 생성 및 번호 확인
        taxi1.setVehicleNumber(UniqueRandomNumberMaker.makeUniqueRandomNumber());
        taxi2.setVehicleNumber(UniqueRandomNumberMaker.makeUniqueRandomNumber());
        Taxi.checkNumber(taxi1, taxi2);

        //출력 -> 주유량, 상태
        taxi1.output1();


        taxi1.takePassenger(2);
        taxi1.toDestination("서울역",2);

        //출력 -> 탑승 승객 수, 잔여 승객 수, 기본 요금, 목적지, 목적지까지 거리, 지불할 요금, 상태
        taxi1.output2();

        taxi1.useFuel(80);
        taxi1.pay();

        //출력 -> 주유량, 누적요금
        taxi1.output3();

        taxi1.takePassenger(5); //경고. 탑승 승객수가 최대 승객수를 넘어간다.
        taxi1.takePassenger(3);
        taxi1.toDestination("구로디지털단지역", 12);

        //출력 -> 탑승 승객 수, 잔여 승객 수, 기본 요금, 목적지, 목적지까지 거리, 지불할 요금
        taxi1.output4();


        taxi1.useFuel(20);
        taxi1.pay();

        //출력 -> 주유량, 상태, 누적요금
        taxi1.output5();

    }

}
