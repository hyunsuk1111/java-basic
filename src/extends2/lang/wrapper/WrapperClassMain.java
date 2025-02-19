package extends2.lang.wrapper;

public class WrapperClassMain {

    public static void main(String[] args) {
        Integer newInteger = new Integer(10);
        //valueOf로 박싱(래퍼클래스로 변경)
        Integer integerObj = Integer.valueOf(10);
        Long longObj = Long.valueOf(100);
        
        //래퍼클래스 toString으로 값 출력하게 재정의,
        System.out.println("integerObj = " + integerObj);
        System.out.println("longObj = " + longObj);

        //intValue로 언박싱
        int intValue = integerObj.intValue();
        
        System.out.println("intValue = " + intValue);
        System.out.println((newInteger == integerObj));
        System.out.println(newInteger.equals(integerObj));
    }
}
