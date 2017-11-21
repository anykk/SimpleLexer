package core;

import java.util.ArrayList;

public class Lexer {
    private ArrayList<IReader> readers;

    public Lexer() {
        readers = new ArrayList<>();
    }

    public void register(IReader reader) {
        readers.add(reader);
    }

    public ArrayList<Token> tokenize(String input) {
        Token maxToken = null;
        ArrayList<Token> tokens = new ArrayList<>();
        for (int i = 0; i < input.length();) {
            int maxLength = 0;
            for (IReader reader : readers) {
                Token currentToken = reader.tryRead(input);
                if (maxLength < currentToken.getLength()) {
                    maxLength = currentToken.getLength();
                    maxToken = currentToken;
                }
            }
            if (maxLength == 0) {
                throw new RuntimeException("Can't read token");
            }
            tokens.add(maxToken);
            input = input.substring(maxLength);
        }
        return tokens;
    }
}
