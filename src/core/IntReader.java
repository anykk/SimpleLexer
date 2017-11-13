package core;

public class IntReader implements IReader {

    @Override
    public Token tryRead(String string) {
        int i = 0;
        while (i < string.length() && Character.isDigit(string.charAt(i)))
            i++;
        return (i == 0) ? new Token("", "") : new Token(string.substring(0, i),"INT");
    }
}

