package extends2.lang.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassMetaMain {

    public static void main(String[] args) throws Exception{
        //Class 조회
        Class stringClass = String.class; // 1.클래스 조회
        //Class clazz1 = new String().getClass(); //2. 인스턴스로 조회
        //Class clazz2 = Class.forName("java.lang.String"); //3. 문자열로 조회

        //모든 필드 출력
        Field[] declaredFields = stringClass.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println("declaredField = " + declaredField);
        }

        //모든 메서드 출력
        Method[] declaredMethod = stringClass.getDeclaredMethods();
        for (Method method : declaredMethod) {
            System.out.println("method = " + method);
        }
    }
}
