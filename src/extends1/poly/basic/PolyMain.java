package extends1.poly.basic;

public class PolyMain {

    public static void main(String[] args) {
        //부모 변수, 부모 인스턴스 참조
        Parent parent = new Parent();

        parent.parentMethod();

        //자식 변수, 자식 인스턴스 참조
        Child child = new Child();

        child.parentMethod();
        child.chileMethod();

        //부모 변수, 자식 인스턴스 참조
        //인스턴스의 타입이 Parent 이므로 poly.childMethod 불가
        //상속 관계는 아래에서 위로는 향하지만 그 반대는 안됨 >> 캐스팅으로 해결
        Parent poly = new Child();
        poly.parentMethod();
    }
}
