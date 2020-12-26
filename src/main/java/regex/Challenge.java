package regex;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Challenge {

    public static void main(String[] args) {

        String challenge1 = "I want a bike";
        String regEx = "I want a \\w+.";
        System.out.println(challenge1.matches(regEx));

        String challenge2 = "I want a ball";
        System.out.println(challenge2);

        Pattern pattern = Pattern.compile(regEx);
        Matcher matcher = pattern.matcher(challenge1);
        System.out.println(matcher.matches());

        String challenge3 = "Replace all blanks with underscores";
        System.out.println(challenge3.replaceAll("\\s", "_"));

        String challenge4 = "aaabccccdddeefgg";
        String regEx2 = "^a{3}bc{4}d{3}e{2}fg{2}$";
        Pattern pattern2 = Pattern.compile(regEx2);
        Matcher matcher2 = pattern2.matcher(challenge4);
        System.out.println(matcher2.matches());

        String challenge5 = "abcd.123";
        System.out.println(challenge5.matches("[a-zA-Z]{4}\\.[0-9]*"));

        String challenge6 = "abcd.135uvqz.7tzik.999";
        Pattern pattern3 = Pattern.compile("[0-9]");
        Matcher matcher3 = pattern3.matcher(challenge6);
        while (matcher3.find()) {
            System.out.println("Occurrence: " + matcher3.group(1));
        }

    }
}
