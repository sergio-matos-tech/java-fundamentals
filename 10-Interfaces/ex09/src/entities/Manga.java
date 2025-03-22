package entities;

public class Manga implements Comparable<Manga> {
    private Long id;
    private String name;
    private Double price;


    public Manga(Long id, String name, Double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public int compareTo(Manga o) {
        return price.compareTo(o.getPrice());
    }

    @Override
    public String toString() {
        return "Manga {" +
                "id = " + id +
                ", name = ' " + name + '\'' +
                ", price = $" + price +
                "}\n";
    }
}
