package extends2.lang.immutable.address;

public class RefMain_2 {
    public static void main(String[] args) {

        //참조형은 하나의 인스턴스 공유 가능
        ImmutableAddress address1 = new ImmutableAddress("서울");
        ImmutableAddress address2 = address1;

        System.out.println(address1);
        System.out.println(address2);

        //address2.setValue("부산");
        address2 = new ImmutableAddress("부산");
        System.out.println("address1 = " + address1);
        System.out.println("address2 = " + address2);
    }
}
