package extends2.lang.string.equals;

public class StringEqualsMain1 {

    public static void main(String[] args) {
        String s1 = new String("hello");
        String s2 = new String("hello");

        //참조값을 비교하니 당연히 false
        System.out.println("비교1 : " + (s1 == s2));
        //논리적으로 비교 자바에서 오버라이딩 해놓음, true
        System.out.println("비교2 : " + s1.equals(s2));

        String s3 = "hello";
        String s4 = "hello";

        //클래스 로딩 시 문자열풀에 등록, 동일한게 있다면 생성하지 않고 사용
        System.out.println("비교1 : " + (s3 == s4));
        System.out.println("비교2 : " + s3.equals(s4));
    }
}
