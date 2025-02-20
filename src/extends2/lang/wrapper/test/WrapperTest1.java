package extends2.lang.wrapper.test;

public class WrapperTest1 {

    public static void main(String[] args) {
        String str1 = "10";
        String str2 = "20";

        int num1 = Integer.parseInt(str1);
        int num2 = Integer.parseInt(str2);

        System.out.println("Integer.sum(num1,num2) = " + Integer.sum(num1,num2));
    }
}
