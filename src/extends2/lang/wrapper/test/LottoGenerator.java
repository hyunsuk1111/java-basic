package extends2.lang.wrapper.test;

import java.util.Random;

public class LottoGenerator {

    private final Random random = new Random();
    private int[] lottoNum;
    private int count;

    public int[] generate() {
        lottoNum = new int[6];
        count = 0;

        while (count < 6) {
            int number = random.nextInt(45) + 1;

            if (checkDuplicated(number)) {
                lottoNum[count] = number;
                count++;
            }
        }

        return lottoNum;
    }

    private boolean checkDuplicated(int number) {
        boolean result = true;

        for (int i = 0; i < count; i++) {
            if (lottoNum[i] == number) {
                result = false;
            }
        }
        return result;
    }
}
