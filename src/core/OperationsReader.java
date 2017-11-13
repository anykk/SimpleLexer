package core;

public class OperationsReader implements IReader {
    private char[] abc = new char[] {'+', '-', '/', '*', '\\'};

    @Override
    public Token tryRead(String string) {
        int i = 0;
        while (i < string.length() && isOperation(string.charAt(i)))
            i++;
        return (i == 0) ? new Token("", "") : new Token(string.substring(0, i), "OPERATION");
    }

    private boolean isOperation(char c) {
        for (char operation : abc)
            if (operation == c)
                return true;
        return false;
    }
}

