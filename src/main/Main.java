package main;

import core.*;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Lexer lexer = new Lexer();
        lexer.register(new IntReader());
        lexer.register(new WhitespaceReader());
        lexer.register(new VectorReader());
        lexer.register(new OperationsReader());
        lexer.register(new DoubleReader());
        ArrayList<Token> tokens = lexer.tokenize("(1, 2, 0, -4) + 45 - 789.56 + -1 -26.895+/* ");
        for (Token token : tokens)
            System.out.println(token);
    }
}
