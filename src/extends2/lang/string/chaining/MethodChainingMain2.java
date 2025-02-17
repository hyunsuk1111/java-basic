package extends2.lang.string.chaining;

public class MethodChainingMain2 {

    public static void main(String[] args) {
        ValueAdder adder = new ValueAdder();

        ValueAdder add1 = adder.add(1);
        ValueAdder add2 = adder.add(2);
        ValueAdder add3 = adder.add(3);

        int result = add3.getValue();
        System.out.println("result = " + result);
    }
}
