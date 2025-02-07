package extends2.lang.object.tostring;

public class ToStringMain2 {

    public static void main(String[] args) {
        Car car = new Car("Model Y");

        Dog dog = new Dog("멍멍이1", 2);
        Dog dog1 = new Dog("멍멍이2", 5);

        System.out.println(car.toString());
        System.out.println("dog = " + dog.toString());
        System.out.println("dog = " + dog1.toString());

        System.out.println(car);
        System.out.println("dog = " + dog);
        System.out.println("dog = " + dog1);
    }
}
