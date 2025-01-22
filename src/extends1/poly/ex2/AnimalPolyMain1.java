package extends1.poly.ex2;

public class AnimalPolyMain1 {

    public static void main(String[] args) {

        Animal dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();
        Duck duck = new Duck();

        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(caw);
        soundAnimal(duck);
    }

    //부모는 자식을 담을수 있음, 다형성
    private static void soundAnimal(Animal animal) {
        System.out.println("동물 소리 테스트 시작");

        //오버라이딩 우선권
        animal.sound();

        System.out.println("동물 소리 테스트 종료");
    }
}
