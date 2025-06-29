package domain;

import java.util.Objects;

public record Manga(String name, Integer episodes) {

    public Manga {
        Objects.requireNonNull(name);
    }

}
