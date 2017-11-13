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

    public int length() {
        return length;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return type + ":" + value;
    }
}
