package extends2.lang.wrapper.test;

import java.util.Arrays;
import java.util.stream.IntStream;

public class LottoMain {

    public static void main(String[] args) {

        LottoGenerator lottoGenerator = new LottoGenerator();

        int[] generate = lottoGenerator.generate();

        Arrays.stream(generate).sorted().forEach(i ->
                System.out.println("i = " + i));
    }
}
