package onboarding;

import java.util.List;

public class Problem6 {
    public static List<String> solution(List<List<String>> forms) {
        List<String> answer = List.of("answer");
        return answer;
    }

    private static boolean isRightEmailDomain (String domain) {
        String rightDomain = "email.com";
        if (domain.equals(rightDomain)) {
            return true;
        }
        return false;
    }

    private static boolean isRightEmailAddress (String address) {
        if (address.length() > 0 && address.length() < 10) {
            return true;
        }
        return false;
    }

    private static boolean isRightNicknameLength (String nickname) {
        if (nickname.length() > 0 && nickname.length() < 20) {
            return true;
        }
        return false;
    }
}
