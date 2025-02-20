package extends2.lang.system;

import java.util.Arrays;

public class SystemMain {

    public static void main(String[] args) {
        long currentTimeMillis = System.currentTimeMillis();

        long nanoTime = System.nanoTime();

        //운영체제사용
        System.out.println("System.getenv() = " + System.getenv());

        //자바사용
        System.out.println(System.getProperties());

        char[] originalArray = {'h', 'e', 'l', 'l', 'o'};
        char[] copiedArray = new char[5];

        System.arraycopy(originalArray, 0, copiedArray, 0, originalArray.length);
        System.out.println("Arrays.toString(copiedArray) = " + Arrays.toString(copiedArray));

        System.exit(0);
        System.out.println("hello");
    }
}
