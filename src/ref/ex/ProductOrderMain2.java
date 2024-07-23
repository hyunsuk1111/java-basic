package ref.ex;

public class ProductOrderMain2 {
    public static void main(String[] args) {
        ProductOrder order1 = createOrder("두부", 2000, 2);
        ProductOrder order2 = createOrder("김치", 5000, 1);
        ProductOrder order3 = createOrder("콜라", 1500, 2);

        ProductOrder[] productOrders = {order1, order2, order3};

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
