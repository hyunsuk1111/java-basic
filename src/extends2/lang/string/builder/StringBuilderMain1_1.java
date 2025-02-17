package extends2.lang.string.builder;

public class StringBuilderMain1_1 {

    //String = "A" + "B" + "C" + "D"
    //String = new String("AB") + "C" + "D"
    //이런식으로 문자열 연산의 경우 3개의 객체가 생성되고 GC에 의해 최종 생성된 객체를 제외하고 제거된다.
    //StringBuilder는 가변 객체를 이요ㅕㅇ할수있다.

    public static void main(String[] args) {
        //변경이 끝나면 String으로 반환하는것이 안전
        StringBuilder sb = new StringBuilder();

        sb.append("A");
        sb.append("B");
        sb.append("C");
        sb.append("D");

        System.out.println("sb = " + sb);

        sb.insert(4, "Java");
        System.out.println("sb = " + sb);

        sb.delete(4, 8);
        System.out.println("sb = " + sb);

        //StringBuilder > String
        String string = sb.toString();
        System.out.println("string = " + string);
    }
}
