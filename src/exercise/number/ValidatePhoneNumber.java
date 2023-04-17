package exercise.number;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatePhoneNumber {
    private static Pattern pattern;
    private static Matcher matcher;
    private static final String CHECKNUMBER_REGEX = "^\\(\\d{2}\\)-\\(0\\d{9}\\)$";

    public ValidatePhoneNumber() {
        pattern = Pattern.compile(CHECKNUMBER_REGEX);
    }

    public boolean validate(String regex){
        Pattern pattern = Pattern.compile(CHECKNUMBER_REGEX);
        Matcher matcher =pattern.matcher(regex);
        return matcher.matches();
    }

    //    ^\\(\\d{2}\\)-\\(0\\d{9}\\)$
    // - Số điện thoại hợp lệ: (84)-(0978489648)
    //
    //     - Số điện thoại không hợp lệ: (a8)-(22222222), (84)-(22b22222), (84)-(9978489648)
}

class Run{
    public static ValidatePhoneNumber validatePhoneNumber;
    public static final String[] validNumber = new String[]{"(84)-(0978489648)","(84)-(0969969415)"};
    public static final String[] invalidNumber = new String[]{"(a8)-(22222222)", "(84)-(22b22222)","(84)-(9978489648)"};

    public static void main(String[] args) {
        validatePhoneNumber = new ValidatePhoneNumber();
        for (String number: validNumber
        ) {
            boolean isValid = validatePhoneNumber.validate(number);
            System.out.println(" Name is " + number + " isValid: " + isValid);
        }

        for (String num: invalidNumber
        ) {
            boolean isValid = validatePhoneNumber.validate(num);
            System.out.println(" Name is " + num + " isValid: " + isValid);
        }
    }
}
