import jdk.nashorn.internal.runtime.regexp.joni.Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher("12345");
        boolean ismatcher = matcher.matches();
        System.out.println(ismatcher);
    }
}