package extends2.lang.object.poly;

public class ObjectPolyExample1 {
    public static void main(String[] args) {

        Dog dog = new Dog();
        Car car = new Car();

        action(dog);
        action(car);

    }

    private static void action(Object object) {
        //obj.sound(); 컴파일 오류, Object는 sound가 없음
        //obj.move(); 컴파일 오류, Object는 move 없음
        
        //객체에 맞는 다운 캐스팅
        if (object instanceof Dog dog) {
            dog.sound();
        } else if (object instanceof Car car) {
            car.move();
        }
    }

}
