package extends2.nested.inner;

public class InnerOuterMain {

    public static void main(String[] args) {
        InnerOuter outer = new InnerOuter();

        //내부클래스는 바깥클래스의 인스턴스에 소속된다. 따라서 바깥클래스의 인스턴스 정보를 알아야 생성가능
        //내부클래스는 new 바깥클래스의인스턴스참조.내부클래스()로 생성 가능
        InnerOuter.inner inner = outer.new inner();
        inner.print();
        System.out.println(inner.getClass());
    }
}
