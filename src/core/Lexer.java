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
        ArrayList<Token> tokens = new ArrayList<>();
        for(int i = 0; i < input.length();) {
            Token maxToken = new Token("", "");
            for (IReader reader : readers) {
                Token currentToken = reader.tryRead(input);
                if (maxToken.length() < currentToken.length())
                    maxToken = currentToken;
            }
            if (maxToken.getValue().equals(""))
                throw new RuntimeException("Can't read token");
            tokens.add(maxToken);
            input = input.substring(maxToken.length());
        }
        return tokens;
    }
}
