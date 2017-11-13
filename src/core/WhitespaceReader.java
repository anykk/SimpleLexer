package core;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WhitespaceReader implements IReader {
    private Pattern pattern;

    public WhitespaceReader() {
        pattern = Pattern.compile("\\s+");
    }

    @Override
    public Token tryRead(String string) {
        Matcher matcher = pattern.matcher(string);

        if (!matcher.lookingAt()) return new Token("", "");
        return new Token(matcher.group(), "WHITESPACE");
    }
}

