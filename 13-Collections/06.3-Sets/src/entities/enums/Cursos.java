package entities.enums;

public enum Cursos {
    JAVA (1),
    PYTHON (2),
    JAVASCRIPT (3),
    HTML (4);

    private final int code;

    Cursos(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}
