package core;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DoubleReader implements IReader{
    private Pattern pattern;

    public DoubleReader() {
        pattern = Pattern.compile("-?\\d+.\\d+");
    }

    @Override
    public Token tryRead(String string) {
        Matcher matcher = pattern.matcher(string);

        if (!matcher.lookingAt()) return null;
        return new Token(matcher.group(), "DOUBLE");
    }
}
