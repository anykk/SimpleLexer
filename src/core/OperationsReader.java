package core;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class OperationsReader implements IReader {
    private Pattern pattern;

    public OperationsReader() {
        pattern = Pattern.compile("[-+*/]+");
    }

    @Override
    public Token tryRead(String string) {
        Matcher matcher = pattern.matcher(string);

        if (!matcher.lookingAt()) return new Token("", "");
        return new Token(matcher.group(), "OPERATION");
    }
}

