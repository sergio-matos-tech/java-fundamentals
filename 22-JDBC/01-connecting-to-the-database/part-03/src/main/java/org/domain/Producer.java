package org.domain;

import java.util.Objects;

public class Producer {
    private final Integer id;
    private final String name;

    private Producer(Builder builder) {
        id = builder.id;
        name = builder.name;
    }

    public static final class Builder {
        private Integer id;
        private String name;

        public Builder() {
        }

        public Builder id(Integer val) {
            id = val;
            return this;
        }

        public Builder name(String val) {
            name = val;
            return this;
        }

        public Producer build() {
            return new Producer(this);
        }

        public static Builder builder() {
            return new Builder();
        }
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Producer producer = (Producer) o;
        return Objects.equals(id, producer.id) && Objects.equals(name, producer.name);
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "Producer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
