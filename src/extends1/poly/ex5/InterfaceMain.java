package extends1.poly.ex5;

import extends1.poly.ex4.AbstractAnimal;

public class InterfaceMain {

    public static void main(String[] args) {

        Cat cat = new Cat();
        Dog dog = new Dog();
        Caw caw = new Caw();

        soundAnimal(cat);
        soundAnimal(dog);
        soundAnimal(caw);

    }

    //변하지 않는 부분
    private static void soundAnimal(InterfaceAnimal animal) {
        System.out.println("동물 소리 테스트 시작");

        animal.sound();

        System.out.println("동물 소리 테스트 종료");
    }

    //변하지 않는 부분
    private static void moveAnimal(InterfaceAnimal animal) {
        System.out.println("동물 이동 테스트 시작");

        animal.move();

        System.out.println("동물 이동 테스트 종료");
    }
}
