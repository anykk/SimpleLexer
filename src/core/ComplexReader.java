package core;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ComplexReader implements IReader {
    private Pattern pattern;

    public ComplexReader() {
        pattern = Pattern.compile("(\\d+)?\\s?[+-]?\\s?(\\d+)?i");
    }

    @Override
    public Token tryRead(String string) {
        Matcher matcher = pattern.matcher(string);

        if (!matcher.lookingAt()) return null;
        return new Token(matcher.group(), "COMPLEX");
    }
}
