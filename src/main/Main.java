package main;

import core.*;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Lexer lexer = new Lexer();
        lexer.register(new IntReader());
        lexer.register(new WhitespaceReader());
        lexer.register(new OperationsReader());
        ArrayList<Token> tokens = lexer.tokenize("");
        for (Token token: tokens) {
            System.out.println(token.toString());
        }
    }
}
