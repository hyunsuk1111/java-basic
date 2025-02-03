package extends1.poly.car1;

public class CarMain1 {

    public static void main(String[] args) {
        Driver driver = new Driver();

        driver.drive(new K3Car());
        driver.drive(new Model3Car());
        driver.drive(new NewCar());
    }
}
