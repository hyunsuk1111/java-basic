package extends2.enumeration.test.ex1;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class AuthGradeMain2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("당신의 등급을 입력하세요" + Arrays.toString(AuthGrade.values()));
        String grade = sc.nextLine();

        AuthGrade authGrade = AuthGrade.valueOf(grade.toUpperCase());
        System.out.println("authGrade = " + authGrade.getDescription());

        List<String> screen = DisplayView.getScreen(authGrade);
        System.out.println("screen = " + screen);

    }
}
