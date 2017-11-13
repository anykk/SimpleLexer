package core;

public class Token {
    private final String value;
    private final String type;
    private final int length;

    public Token(String value,String type) {
        this.value = value;
        this.type = type;
        this.length = value.length();
    }

    public int getLength() {
        return length;
    }

    public String getType() {
        return type;
    }

    @Override
    public boolean equals(Object obj) {
        Token other = (Token)obj;
        return this.toString().equals(other.toString());
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return type + ":" + value;
    }

}
