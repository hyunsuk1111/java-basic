package extends1.poly.pay2;

public abstract class PayStore {

    //변하는 부분 - 클래스화 및 다형적 참조활용
    //NULL 반환의 경우 별도의 클래스 생성
    public static Pay getPayInfo(String option) {
        if (option.equals("kakao")) {
            return new KakaoPay();

        } else if (option.equals("naver")) {
            return new NaverPay();

        } else if (option.equals("new")) {
            return new NewPay();
        } else {
            return new DefaultPay();
        }
    }
}
