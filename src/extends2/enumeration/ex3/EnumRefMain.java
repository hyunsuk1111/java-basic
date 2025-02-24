package extends2.enumeration.ex3;

import extends2.enumeration.ex1.StringGrade;

public class EnumRefMain {

    public static void main(String[] args) {
        System.out.println("Grade.BASIC.getClass() = " + Grade.BASIC.getClass());
        System.out.println("Grade.BASIC.getClass() = " + Grade.GOLD.getClass());
        System.out.println("Grade.BASIC.getClass() = " + Grade.DIAMOND.getClass());

        System.out.println("refValue(Grade.BASIC) = " + refValue(Grade.BASIC));
        System.out.println("refValue(Grade.BASIC) = " + refValue(Grade.GOLD));
        System.out.println("refValue(Grade.BASIC) = " + refValue(Grade.DIAMOND));
    }

    private static String refValue(Grade grade) {
        return Integer.toHexString(System.identityHashCode(grade));
    }
}
