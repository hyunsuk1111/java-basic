package extends1.poly.pay2;

public class PayService {

    public void processPay(String option, int amount) {

        System.out.println("결제를 시작합니다 : option=" + option + ", amount = " + amount);

        //결제정보 반환
        Pay pay = PayStore.getPayInfo(option);

        //결제처리
        boolean result = pay.pay(amount);

        //결과 출력
        printResult(result);
    }

    private void printResult(boolean result) {
        if (result) {
            System.out.println("결제 성공");
        } else {
            System.out.println("결제 실패");
        }
    }
}
