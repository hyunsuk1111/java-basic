package extends2.nested.nested;

public class NestedOuter {

    //정적변수
    private static int outClassValue = 3;
    //인스턴스변수
    private int outInstanceValue = 2;

    //정적 중첩 클래스
    static class Nested {
        private int nestedInstanceValue = 1;

        public void print() {
            //자신의 멤버에 접근
            System.out.println(nestedInstanceValue);

            //바깥 클래스의 인스턴스 멤버에 접근할 수 없다.
            //System.out.println(outInstanceValue);

            //바깥 클래스의 클래스 멤버에는 접근 할 수 있다. private도 같은 클래스에 있기 때문에 접근가능
            System.out.println(outClassValue);
        }
    }

}
