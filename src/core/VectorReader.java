package core;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VectorReader implements IReader {
    private Pattern pattern;

    public VectorReader() {
        pattern = Pattern.compile("[\\[{(<](\\s?-?\\d+,\\s?)+\\s?-?\\d+\\s?[]})>]");
    }

    @Override
    public Token tryRead(String string) {
        Matcher matcher = pattern.matcher(string);

        if (!matcher.lookingAt()) return new Token("", "");
        return new Token(matcher.group(), "VECTOR");
    }
}
