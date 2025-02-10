package extends2.lang.object.test;

public class RectangleMain {

    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(100, 200);
        Rectangle rect2 = new Rectangle(100, 200);

        //println에서 toString 호출함
        System.out.println(rect1);
        System.out.println(rect2);

        System.out.println(rect1 == rect2);
        System.out.println(rect1.equals(rect2));
    }
}
