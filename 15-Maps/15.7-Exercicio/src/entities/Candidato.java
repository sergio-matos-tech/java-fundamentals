package entities;

import java.util.Objects;

public class Candidato {
    private String nome;
    private Integer qtdVotos;

    public Candidato(String nome) {
        this.nome = nome;
        this.qtdVotos = 0;
    }

    public String getNome() {
        return nome;
    }

    public Integer getQtdVotos() {
        return qtdVotos;
    }

    public void adicionarVotos(Integer qtd) {
        this.qtdVotos += qtd;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Candidato candidato = (Candidato) o;
        return Objects.equals(getNome(), candidato.getNome());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getNome());
    }
}
