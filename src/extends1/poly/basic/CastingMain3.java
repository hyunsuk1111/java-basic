package extends1.poly.basic;

public class CastingMain3 {
    public static void main(String[] args) {
        
        //업캐스팅
        Child child = new Child();

        Parent parent1 = (Parent) child; // 업캐스팅은 생략 가능, 생략 권장
        Parent parent2 = child; // 위 아래 동일

        parent1.parentMethod();
        parent2.parentMethod();
    }
}
