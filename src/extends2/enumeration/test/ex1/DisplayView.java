package extends2.enumeration.test.ex1;

import java.util.Arrays;
import java.util.List;

public class DisplayView {
    private static final String mainView = "메인 화면";
    private static final String EmailView = "이메일 관리 화면";
    private static final String AdminView = "관리자 화면";

    public static List<String> getScreen(AuthGrade authGrade) {
        switch (authGrade) {
            case GUEST:
                return Arrays.asList(mainView);

            case LOGIN:
                return Arrays.asList(mainView, EmailView);

            case ADMIN:
                return Arrays.asList(mainView, EmailView, AdminView);
            default:
                throw new IllegalArgumentException("잘못된 등급");
        }
    }
}
