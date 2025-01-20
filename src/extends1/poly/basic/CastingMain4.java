package extends1.poly.basic;

public class CastingMain4 {
    public static void main(String[] args) {

        //업캐스팅의 경우 상위타입까지 같이 메모리에 생성 문제발생x
        Parent parent1 = new Child();
        Child child1 = (Child) parent1;
        child1.parentMethod();

        //다운캐스팅의 경우 해당 객체가 메모리에 없을 가능성 있음, 런타임오류
        Parent parent2 = new Parent();
        Child child2 = (Child) parent2;
        child2.parentMethod();
    }
}
