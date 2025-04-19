import java.util.Objects;
import java.util.concurrent.ThreadLocalRandom;

public class Manga {
    private Long id;
    private String nome;
    private Double preco;

    public Manga(Double preco, String nome) {
        this.id = ThreadLocalRandom.current().nextLong();
        this.preco = preco;
        this.nome = nome;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Manga manga = (Manga) o;
        return Objects.equals(getId(), manga.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }
}
