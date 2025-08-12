package domain;

public enum Country {
    BRAZIL (1),
    USA (2),
    ;

    final int i;

    Country(int i) {
        this.i = i;
    }
}
