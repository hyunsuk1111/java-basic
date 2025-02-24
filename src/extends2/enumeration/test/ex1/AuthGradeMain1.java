package extends2.enumeration.test.ex1;

public class AuthGradeMain1 {

    public static void main(String[] args) {
        for (AuthGrade value : AuthGrade.values()) {
            System.out.println("grade = " + value.name() +" level : " + value.getLevel() + " 설명 : " + value.getDescription());
        }

    }
}
