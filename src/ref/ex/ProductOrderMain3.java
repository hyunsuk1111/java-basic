package ref.ex;

import java.util.Scanner;

public class ProductOrderMain3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("입력할 주문의 개수를 입력하세요");
        int n = sc.nextInt();
        sc.nextLine();

        ProductOrder[] productOrders = new ProductOrder[n];

        for (int i = 0; i < productOrders.length; i++) {
            System.out.println((i + 1) + "번째 주문 정보를 입력하세요 ");

            System.out.print("상품명 : ");
            String productName = sc.nextLine();

            System.out.print("가격 : ");
            int price = sc.nextInt();

            System.out.print("수량 : ");
            int quantity = sc.nextInt();
            sc.nextLine();

            productOrders[i] = createOrder(productName, price, quantity);
        }

        printOrders(productOrders);

        int totalPrice = getTotalAmount(productOrders);
        System.out.println("totalPrice = " + totalPrice);

    }

    
    //생성
    public static ProductOrder createOrder(String productName, int price, int quantity) {
        ProductOrder productOrder = new ProductOrder();

        productOrder.productName = productName;
        productOrder.price = price;
        productOrder.quantity = quantity;

        return productOrder;
    }

    //출력_배열전체
    public static void printOrders(ProductOrder[] productOrders) {
        for (ProductOrder order : productOrders) {
            System.out.println("productName = " + order.productName + " price = " + order.price + " quantity = " + order.quantity);
        }
    }

    //출력_가격
    public static int getTotalAmount(ProductOrder[] productOrders) {
        int amount = 0;

        for (ProductOrder order : productOrders) {
            amount += order.price * order.quantity;
        }

        return amount;
    }
}
