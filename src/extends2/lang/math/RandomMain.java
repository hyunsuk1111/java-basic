package extends2.lang.math;

import java.util.Random;

public class RandomMain {

    public static void main(String[] args) {
        //seed가 같으면 Random의 결과가 같다.
        Random random = new Random(1);

        int randomInt = random.nextInt();
        System.out.println("randomInt = " + randomInt);

        double randomDouble = random.nextDouble();
        System.out.println("randomDouble = " + randomDouble);

        boolean randomBoolean = random.nextBoolean();
        System.out.println("randomBoolean = " + randomBoolean);

        int randomRange1 = random.nextInt(10) + 1;
        System.out.println("randomRange1 = " + randomRange1);
    }
}
