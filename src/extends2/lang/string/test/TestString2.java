package extends2.lang.string.test;

public class TestString2 {

    public static void main(String[] args) {
        String[] arr = {"hello", "java", "jvm", "spring", "jpa"};
        int result = 0;

        for (String s : arr) {
            System.out.println(s + " : " + s.length());
            result += s.length();
        }

        System.out.println("result = " + result);
    }
}
