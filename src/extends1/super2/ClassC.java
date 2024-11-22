package extends1.super2;

public class ClassC extends ClassB {

    public ClassC() {
        //생성자가 정의가 되면 자바가 기본생성자를 만들지 않음
        super(10, 20);
        System.out.println("ClassC 생성자");
    }

}
