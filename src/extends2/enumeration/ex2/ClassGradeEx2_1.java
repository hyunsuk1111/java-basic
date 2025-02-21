package extends2.enumeration.ex2;

public class ClassGradeEx2_1 {

    public static void main(String[] args) {
        int price = 10000;

        DiscountService discountService = new DiscountService();

        int basic = discountService.discount(ClassGrade.BASIC, price);
        int gold = discountService.discount(ClassGrade.GOLD, price);
        int diamond = discountService.discount(ClassGrade.DIAMOND, price);
        //ClassGrade 를 다른곳에서 객체로 생성할경우 할인적용x, 객체생성못하게 막아야함
        //private 생성자 추가
        //ClassGrade grade = new ClassGrade();
        //참조값으로 비교하기 때문에 주소값 다름
    }
}
