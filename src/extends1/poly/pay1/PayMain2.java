package extends1.poly.pay1;

import java.util.Scanner;

public class PayMain2 {

    public static void main(String[] args) {
        PayService payService = new PayService();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("결제 수단 입력 : ");
            String payOption = scanner.nextLine();

            if (payOption.equals("exit")) {
                System.out.println("프로그램 종료");
                return;
            }

            System.out.println("결제 금액 입력 : ");
            int amount = scanner.nextInt();
            scanner.nextLine();

            payService.processPay(payOption, amount);

        }

    }
}
