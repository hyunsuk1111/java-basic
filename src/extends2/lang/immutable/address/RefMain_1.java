package extends2.lang.immutable.address;

public class RefMain_1 {
    public static void main(String[] args) {

        //참조형은 하나의 인스턴스 공유 가능
        Address address1 = new Address("서울");
        Address address2 = address1;

        System.out.println(address1);
        System.out.println(address2);

        address2.setValue("부산");
        System.out.println("address1 = " + address1);
        System.out.println("address2 = " + address2);
    }
}
