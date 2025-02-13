package entities;

public abstract class Pessoa {
    private String nome;
    private String endereco;
    private Double rendaAnual;

    public Pessoa() {}

    public Pessoa(String nome, String endereco, Double rendaAnual) {
        this.nome = nome;
        this.endereco = endereco;
        this.rendaAnual = rendaAnual;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getRendaAnual() {
        return rendaAnual;
    }

    public void setRendaAnual(Double rendaAnual) {
        this.rendaAnual = rendaAnual;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public abstract Double calcularImpostoDeRenda2024();
}
