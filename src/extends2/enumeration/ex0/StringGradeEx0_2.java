package extends2.enumeration.ex0;

public class StringGradeEx0_2 {

    public static void main(String[] args) {
        int price = 10000;
        DiscountService discountService = new DiscountService();

        //존재하지않는 등급
        int vip = discountService.discount("VIP", price);
        //오타 >> 컴파일 에러안남
        //소문자 입력 
        //타입 안정성 -> 문자열 오타발생 유효
        //데이터 일관성 떨어짐
        
        int basic = discountService.discount("BASIC", price);
        int gold = discountService.discount("GOLD", price);
        int diamond = discountService.discount("DIAMOND", price);

        System.out.println("basic = " + basic);
        System.out.println("gold = " + gold);
        System.out.println("diamond = " + diamond);
        System.out.println("vip = " + vip);
    }
}
