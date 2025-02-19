package extends2.lang.wrapper;

public class WrapperVsPrimitive {

    public static void main(String[] args) {
        //기본형이던 래퍼형이던 유지보수하기 좋은 코드를 먼저 고민!
        int iterations = 1_000_000_000;
        long startTime, endTime;

        long sumPrimitive = 0;
        startTime = System.currentTimeMillis();

        for (int i = 0; i < iterations; i++) {
            sumPrimitive += i;
        }

        endTime = System.currentTimeMillis();
        System.out.println("sumPrimitive = " + sumPrimitive);
        System.out.println("endTime = " + (endTime - startTime) + "ms");

        //래퍼클래스 Long
        Long sumWrapper = 0L;
        startTime = System.currentTimeMillis();

        for (int i = 0; i < iterations; i++) {
            sumWrapper += i;
        }

        endTime = System.currentTimeMillis();
        System.out.println("sumPrimitive = " + sumWrapper);
        System.out.println("endTime = " + (endTime - startTime) + "ms");

    }
}
