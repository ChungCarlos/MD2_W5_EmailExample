package exercise.name;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckName {
    private static Pattern pattern;
    private Matcher matcher;
    private static final String CHECK_REGEX = "^[CAP]\\d{4}[GHIK]$";

    public CheckName(){
        pattern = Pattern.compile(CHECK_REGEX);
    }

    public boolean validate(String regex){
        Pattern pattern = Pattern.compile(CHECK_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
class Run{
    public static CheckName checkName;
    public static final String[] validName = new String[]{"C0223G", "A0323K"};
    public static final String[] invalidName = new String[]{"M0318G", "P0323A"};

    public static void main(String[] args) {
        checkName = new CheckName();
        for (String name: validName
             ) {
            boolean isValid = checkName.validate(name);
            System.out.println(" Name is " + name + " isValid: " + isValid);
        }

        for (String name: invalidName
        ) {
            boolean isValid = checkName.validate(name);
            System.out.println(" Name is " + name + " isValid: " + isValid);
        }
    }
}
