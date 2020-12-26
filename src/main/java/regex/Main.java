package regex;

public class Main {

    public static void main(String[] args) {

        String string = "I am a string. Yes, I am";
        String yourString = string.replaceAll("I", "you");
        System.out.println(yourString);

        String alphanumeric = "aDasdfsn234lgsd90a";
        System.out.println(alphanumeric.replaceAll("^aDasd", "YYY"));

        System.out.println(alphanumeric.matches("hi"));

        System.out.println(alphanumeric.replaceAll("[aei]", "X"));
        System.out.println(alphanumeric.replaceAll("[aei]Da", "X"));

        System.out.println(alphanumeric.replaceAll("[^D]", "X"));
        System.out.println(alphanumeric.replaceAll("[a-f3-9]", "Y"));
        System.out.println(alphanumeric.replaceAll("(?i)[a-f3-9]", "Y"));
    }
}
