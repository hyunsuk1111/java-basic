package extends2.lang.immutable.change;

public class ImmutableMain1 {

    public static void main(String[] args) {
        ImmutableObj immutableObj = new ImmutableObj(10);

        //불변은 수정시 새로운 객체를 만들어서 반환
        ImmutableObj add = immutableObj.add(20);
        System.out.println("add = " + add.getValue());

        ImmutableObj add1 = immutableObj.add(30);
        System.out.println("add1 = " + add1.getValue());
    }

}
