package core;

public class Token {
    private String value;
    private String type;

    public Token(String value,String type) {
        this.value = value;
        this.type = type;
    }

    public int getLength() {
        return value.length();
    }

    public String getType() {
        return type;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return type + ":" + value;
    }

}