package extends2.nested.local;

public class LocalOuterV2 {

    private int outerInstanceVar = 3;

    public void process(int paramVar) {
        int localVar = 1;

        class LocalPrinter implements Printer{
            public int value = 0;

            @Override
            public void print() {
                System.out.println("value = " + value);
                System.out.println("localVar = " + localVar);
                System.out.println("paramVar = " + paramVar);
                System.out.println("outerInstanceVar = " + outerInstanceVar);
            }
        }

        LocalPrinter printer = new LocalPrinter();
        printer.print();
    }

    public static void main(String[] args) {
        LocalOuterV2 localOuterV1 = new LocalOuterV2();

        localOuterV1.process(3);
    }
}
