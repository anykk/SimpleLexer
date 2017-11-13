package core;

public class WhitespaceReader implements IReader {

    @Override
    public Token tryRead(String string) {
        int i = 0;
        while (i < string.length() && Character.isWhitespace(string.charAt(i)))
            i++;
        return (i == 0) ? new Token("", "") : new Token(string.substring(0, i),"WHITESPACE");
    }
}

