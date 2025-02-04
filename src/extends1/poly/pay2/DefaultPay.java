package extends1.poly.pay2;

public class DefaultPay implements Pay {

    //null 관리 클래스
    @Override
    public boolean pay(int amount) {
        System.out.println("결제 수단이 없습니다.");

        return false;
    }
}
