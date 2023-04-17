import javax.swing.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String str = "Training in Codegym";

        Pattern pattern = Pattern.compile("codegym",Pattern.CASE_INSENSITIVE);

        Matcher matcher = pattern.matcher("Training in Codegym");
        boolean matchFound = matcher.find();
        boolean exactMatch = matcher.matches();

        System.out.println(matcher);
        System.out.println(matchFound);
        System.out.println(exactMatch);
    }
}