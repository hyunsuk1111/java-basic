package extends2.enumeration.ex3;

import java.util.Arrays;

public class EnumMethodMain {

    public static void main(String[] args) {
        Grade[] values = Grade.values();

        //value의 이름, 순서 메서드로 확인 가능
        System.out.println("Arrays.toString(values) = " + Arrays.toString(values));
    }
}
