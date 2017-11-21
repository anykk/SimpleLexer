package main;

import core.*;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Lexer lexer = new Lexer();
        lexer.register(new WhitespaceReader());
        lexer.register(new VectorReader());
        lexer.register(new OperationsReader());
        lexer.register(new DoubleReader());
        lexer.register(new ComplexReader());
        lexer.register(new BracketReader());
        lexer.register(new IntReader());
        ArrayList<Token> tokens = lexer.tokenize("(1,2, 3) + 54 * 789.4 <213> - 564 + 147.4");
        for (Token token : tokens)
            System.out.println(token);
    }
}
