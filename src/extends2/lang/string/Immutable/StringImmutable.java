package extends2.lang.string.Immutable;

public class StringImmutable {

    public static void main(String[] args) {
        String str = "hello";

        //불변객체는 반환이 필요하다
        String concat = str.concat(" java");

        System.out.println("concat = " + concat);
    }
}
