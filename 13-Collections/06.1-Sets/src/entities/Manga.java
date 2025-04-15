package entities;

import java.util.Objects;

public class Manga implements Comparable<Manga> {
    private String name;
    private long id;
    private Double price;

    public Manga(String name, long id, Double price) {
        this.name = name;
        this.id = id;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Manga manga = (Manga) o;
        return getId() == manga.getId() && Objects.equals(getName(), manga.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getId());
    }

    @Override
    public String toString() {
        return "Manga{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Manga o) {
        return price.compareTo(o.getPrice());
    }
}
