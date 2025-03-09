package extends2.nested.nested;

public class NestedOuterMain {

    public static void main(String[] args) {
        NestedOuter outer = new NestedOuter();

        //내부 클래스 생성
        NestedOuter.Nested nested = new NestedOuter.Nested();
        nested.print();
    }
}
