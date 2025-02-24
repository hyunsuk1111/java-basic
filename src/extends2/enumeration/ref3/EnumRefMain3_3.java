package extends2.enumeration.ref3;

public class EnumRefMain3_3 {

    public static void main(String[] args) {
        int price = 10000;

        //printDiscount(Grade.BASIC, price);
        //printDiscount(Grade.GOLD, price);

        Grade[] values = Grade.values();

        for (Grade value : values) {
            printDiscount(value, price);
        }
    }

    private static void printDiscount(Grade grade, int price) {
        System.out.println(grade.name() + "의 할인금액 : " + grade.discount(price));
    }
}
