package extends2.lang.wrapper;

public class AutoboxingMain2 {

    public static void main(String[] args) {
        //primitive >> wrapper (auto)
        int value = 7;

        Integer boxedValue = value;

        //wrapper >> primitive (auto)
        int unboxedValue = boxedValue;

        System.out.println("boxedValue = " + boxedValue);
        System.out.println("unboxedValue = " + unboxedValue);
    }
}
