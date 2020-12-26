package debugging;

import java.util.Locale;

public class StringUtilities {

    private StringBuilder stringBuilder = new StringBuilder();
    private int charsAdded = 0;

    public void addChar(StringBuilder stringBuilder, char c) {
        stringBuilder.append(c);
        charsAdded++;
    }

    public String upperAndPrefix(String str) {
        String upper = str.toUpperCase();
        return "Prefix__" + upper;
    }

    public String suffix(String str) {
        return str + "__Suffix";
    }
}
