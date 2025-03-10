package extends2.nested.inner;

public class InnerOuter {

    private static int outClassValue = 3;
    private int outInstanceValue = 2;


    class inner {
        private int instanceValue = 1;

        public void print() {
            //자기 자신에 접근
            System.out.println("instanceValue = " + instanceValue);

            //외부 클래스의 인스턴스 멤버에 접근 가능, private도 접근 가능
            System.out.println(outInstanceValue);

            //외부 클래스의 클래스 멤버에 접근 가능, private도 접근 가능
            System.out.println(outClassValue);
        }
    }
}
