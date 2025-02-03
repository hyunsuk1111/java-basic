package extends1.poly.car1;

public class Driver {

    public void drive(Car car) {
        System.out.println("자동차 운전");

        car.startEngine();
        car.pressAccelerator();
        car.offEngine();
    }
}
